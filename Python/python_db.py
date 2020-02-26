import sqlite3

def createPhoneBook(DBname):
    conn = sqlite3.connect(DBname)
    cursor = conn.cursor()

    cursor.execute('CREATE TABLE infos (name text, phone int, bday int)')

    conn.commit()
    conn.close()

def insertRecord(DBname):
    conn = sqlite3.connect(DBname)
    cursor = conn.cursor()

    name  = input('이름 : ')
    phone = input('전화번호: ')

    cursor.execute('INSERT INTO infos VALUES ("{}", "{}")'.format(name, phone))

    conn.commit()
    conn.close()

def fetchPhoneBook(DBname):
    conn = sqlite3.connect(DBname)
    cursor = conn.cursor()

    for row in cursor.execute('SELECT * FROM infos'):
        print(row[0], row[1])

    conn.close()

def searchName(DBname):
    conn = sqlite3.connect(DBname)
    cursor = conn.cursor()

    name = input('이름 : ')

    for row in cursor.execute('SELECT * FROM infos WHERE name="{}"'.format(name)):
        print(row)

    conn.close()

def deleteName(DBname):
    conn = sqlite3.connect(DBname)
    cursor = conn.cursor()

    name = input('이름 : ')

    cursor.execute('DELETE FROM infos WHERE name="{}"'.format(name))

    conn.commit()
    conn.close()


DBname = 'phonebook.db'

while True:
    try:
        menu = int(input('DB생성(1) 입력(2) 정보보기(3) 검색(4) 삭제(5) : '))

        if   menu == 1: createPhoneBook(DBname)
        elif menu == 2: insertRecord(DBname)
        elif menu == 3: fetchPhoneBook(DBname)
        elif menu == 4: searchName(DBname)
        elif menu == 5: deleteName(DBname)
        else          : break
    except ValueError:
        print('number only.')
