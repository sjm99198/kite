<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>pc부품 리스트:관리자기능</title>
	
	
	<!-- 기본 CSS 처리 시작 -->
	<%@ include file="/WEB-INF/views/include/basic.jsp" %>	
	<!-- 기본 CSS 처리 끝 -->
	
	<script>
		
	</script>
</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	<!-- 해더 끝 -->


	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
      <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
        
        <div class="lh-100">
          <h6 class="mb-0 text-white lh-100">pc부품 리스트 보기</h6>
          <small>관리자 권한</small>
        </div>
      </div>
      
  <div class="search">
    <select name="searchType">
      <option value="n"<c:out value="${scri.searchType == null ? 'selected' : ''}"/>>-----</option>
      <option value="t"<c:out value="${scri.searchType eq 't' ? 'selected' : ''}"/>>type</option>
      <option value="c"<c:out value="${scri.searchType eq 'c' ? 'selected' : ''}"/>>품명</option>
      <option value="tc"<c:out value="${scri.searchType eq 'tc' ? 'selected' : ''}"/>>전체</option>
    </select>

    <input type="text" name="keyword" id="keywordInput" value="${scri.keyword}"/>

    <button id="searchBtn" type="button">검색</button>
    <script>
      $(function(){
        $('#searchBtn').click(function() {
          self.location = "list" + '${pageMaker.makeQuery(1)}' + "&searchType=" + $("select option:selected").val() + "&keyword=" + encodeURIComponent($('#keywordInput').val());
        });
      });   
    </script>
  </div>



      <div class="my-3 p-3 bg-white rounded box-shadow">
        <h6 class="border-bottom border-gray pb-2 mb-0">pc 부품 목록 </h6>
        <%-- ${listView} --%>
        <table class="table">
        	<tr>
        		<th>No.</th>
        		<th>품명</th>
        		<th>종류</th>
        		<th>상세성능</th>
        		<th>가격</th>
        		<th>작성시간</th>
        		<th>관리</th>
        	</tr>
        	
        	<!-- 리스트 시작 -->
        	
        	
        	
        	
        	
        	<c:forEach items="${listView.list}" var="article" >
        	<tr>
        		<td>${article.idx}</td>
        		<td>${article.title}</td>
        		<td>${article.type}</td>
        		<td>${article.content}</td>
        		<td>${article.price}</td>
        		<td><fmt:formatDate value="${article.regdate}" pattern="yyyy. MM. dd"/>
        		</td>
        		<td>
        			<a href="edit?idx=${article.idx}" class="btn btn-primary">수정</a>
        			<a href="javascript:del(${article.idx})" class="btn btn-danger">삭제</a>
        		</td>
        	</tr>
        	
        	</c:forEach>
        	<!-- 리스트 끝 -->
        	
        	
     
              
        
        </table>
        	
        
        
        
        <div>
        	<c:forEach begin="1" end="${listView.totalPageCount}" var="i">
        	<a href="list?page=${i}">[${i}]</a> 
        	</c:forEach>
        </div>
      </div>

      <div class="my-3 p-3 bg-white rounded box-shadow">
       
        
        
   
        
        
        
      </div>
    </main>




	<!-- 메인 컨텐트 끝 -->





	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
	<!-- 푸터 끝 -->
	
		
	<script>
	
		function del(idx){
			
			if(confirm('삭제하시겠습니까?')) {
				location.href='delete?idx='+idx;
			}
			
		}
	
	</script>
	
	
	
	
	
	
	
	
</body>
</html>