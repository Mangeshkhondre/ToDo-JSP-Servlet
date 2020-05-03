<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<form  action ="add-todo.do" method="post">
		<fieldset class="form-group">
		<lable>Enter Todo</lable>
		<input type="text" name="todo" class="form-control"> <br><br>
		</fieldset>
		<fieldset class="form-group">
		<lable>Catagory</lable>
		<input type="text" name="cat" class="form-control" > <br><br>
		</fieldset>
		<input type="submit" value="add" class="btn btn-success">		
	</form>
	</div>

<%@ include file="../common/footer.jspf"%>