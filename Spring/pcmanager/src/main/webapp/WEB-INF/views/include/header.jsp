<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
	
		<a class="navbar-brand mr-auto mr-lg-0" href="<c:url value="/"/>">PC Manager</a>
		
		
		<button class="navbar-toggler p-0 border-0" type="button"
			data-toggle="offcanvas">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="navbar-collapse offcanvas-collapse"
			id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="#">HOME
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">--</a>	</li>
				<li class="nav-item"><a class="nav-link" href="#">--</a></li>
				<li class="nav-item"><a class="nav-link" href="#">--</a></li>
				<li class="nav-item"><a class="nav-link" href="#">--</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="https://example.com"
					id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">pc조립</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="<c:url value="/guest/write"/>">부품입력</a> 
						<a class="dropdown-item" href="<c:url value="/guest/list"/>">부품리스트보기</a>
					</div>
				</li>
			</ul>
			
			<!-- <form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form> -->
		</div>
	</nav>
	
	
	