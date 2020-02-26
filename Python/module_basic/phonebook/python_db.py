import sqlite3

def createPhoneBook(filename):
    conn = sqlite3.connect(filename)
    cursor = conn.cursor()

    cursor.execute('CREATE TABLE infos (name text, phone text)')

    conn.commit()
    conn.close()

def insertRecord(filename):
    conn = sqlite3.connect(filename)
    cursor = conn.cursor()

    name  = input('이름 : ')
    phone = input('전화번호: ')

    cursor.execute('INSERT INTO infos VALUES ("{}", "{}")'.format(name, phone))

    conn.commit()
    conn.close()

def fetchPhoneBook(filename):
    conn = sqlite3.connect(filename)
    cursor = conn.cursor()

    for row in cursor.execute('SELECT * FROM infos'):
        print(row[0], row[1])

    conn.close()

def searchName(filename):
    conn = sqlite3.connect(filename)
    cursor = conn.cursor()

    name = input('이름 : ')

    for row in cursor.execute('SELECT * FROM infos WHERE name="{}"'.format(name)):
        print(row)

    conn.close()

def deleteName(filename):
    conn = sqlite3.connect(filename)
    cursor = conn.cursor()

    name = input('이름 : ')

    cursor.execute('DELETE FROM infos WHERE name="{}"'.format(name))

    conn.commit()
    conn.close()


filename = 'phonebook.db'

while True:
    try:
        menu = int(input('DB생성(1) 입력(2) 정보보기(3) 검색(4) 삭제(5) : '))

        if   menu == 1: createPhoneBook(filename)
        elif menu == 2: insertRecord(filename)
        elif menu == 3: fetchPhoneBook(filename)
        elif menu == 4: searchName(filename)
        elif menu == 5: deleteName(filename)
        else          : break
    except ValueError:
        print('number only.')
