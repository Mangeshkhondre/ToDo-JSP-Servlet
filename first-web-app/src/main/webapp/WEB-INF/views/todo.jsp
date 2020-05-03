<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<H1>Welcome ${name}<a class="btn pull-right btn-success"  href="/add2-todo.do">Add new Todo</a></H1>
				

		Your Todos are
		
		
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.task}</td>
						<td>${todo.catagory}</td>
						<td>&nbsp; &nbsp;<a class="btn btn-danger" href="/delete-todo.do?todo=${todo.task}&cat=${todo.catagory}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		
		<!-- <form method="POST" action="/add-todo.do">
			New Todo : <input name="todo" type="text" /> <input name="add"
				type="submit" />
		</form> -->
	</div>

	<%@ include file="../common/footer.jspf"%>