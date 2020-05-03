<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
	

	<div class="container">
		<form  action ="login.do" method="post">
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		Enter Name = <input type="text" name="name" ><br><br>
		Enter Password = <input type="password" name="password" ><br><br>
		<input type="submit" value="login">		
	</form>
	</div>

	
<%@ include file="../common/footer.jspf"%>