<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

     
     	<div class="container text-center">
			<c:if test="${!empty theList}">
				<table class="table table-striped" id="table">
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>SURNAME</th>
						<th>AGE</th>
						<th>DELETE</th>
						<th>UPDATE</th>
					</tr>
	 				<c:forEach var="p" items="${theList}">
	            		<tr id="tableRow">
                    		<td class="tableData"><c:out value="${p.id}"/></td>
                    		<td class="tableData"><c:out value="${p.name}"/></td>
                    		<td class="tableData"><c:out value="${p.surname}"/></td>
                    		<td class="tableData"><c:out value="${p.age}"/></td>
							<td><a href="DeletePerson?id=${p.id}">DEL</a></td>
							<td><a href="UpdatePerson?id=${p.id}">UPDATE</a></td>
                		</tr>
					</c:forEach>
				</table>
			</c:if>
		</div>
