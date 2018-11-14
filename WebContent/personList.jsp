<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
</head>
<body>


<div class="container" id="tabs">
  	<h2>Person operations</h2>
  	<br>
  <!-- Nav tabs -->
  <ul class="nav nav-tabs" role="tablist">
    <li class="nav-item">
      <a class="nav-link active" data-toggle="tab" href="#menuAdd">Add person</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="tab" href="#menuList" >List all</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="tab" href="#menuChange">Change a person</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="tab" href="#menuDelete">Delete a person</a>
    </li>
  </ul>

  <!-- Tab panes -->
  <div class="tab-content">
  <!--  Add a person in the database -->
    <div id="menuAdd" class="container tab-pane active"><br>
      <h3>Add a person in the database</h3>
      
     	<form action="AddPerson" method="post">
  		<input type="hidden" name="id" value="${aPerson.id}">
  		<div class="form-group col-3">
    		<label for="formGroupExampleInput">Name</label>
    		<input type="text" class="form-control" id="inputName" placeholder="Name" value="${aPerson.name}" name="name">
  		</div>
  
  		<div class="form-group col-3">
    		<label for="formGroupExampleInput2">Surname</label>
    		<input type="text" class="form-control" id="inputNameSurname" placeholder="Surname" value="${aPerson.surname}" name="surname">
  		</div>
   		
   		<div class="form-group col-3">
    	
    	<label for="formGroupExampleInput2">Age</label>
    		<input type="number" class="form-control" id="inputAge" placeholder="Age" value="${aPerson.age}"  name="age">
  		</div>
   		
   		<div class="form-group col-3">
    		<button type="submit" class="btn btn-primary">Send</button>
     	</div>
		</form>
    </div>
    
      <!--  List a person in the database -->
    <div id="menuList" class="container tab-pane fade"><br>
      <h3>List a person in the database</h3>
             <form action="ListPerson" method="post" id="formList">
            <button type="submit" onclick="addList2()" class="btn btn-primary">List</button>
       		<div id="divList"></div>
      	    </form>	
            
      <div id="viewTable"></div>
    </div>
    
    <div id="menuChange" class="container tab-pane fade"><br>
       <!--  Modify a person in the database -->
      
      <h3>Modify a person based on id</h3>
      <div class="form-group col-3">
    		<button type="submit" class="btn btn-primary">Modify</button>
    		<jsp:include page='/Modify.jsp' />
     	</div>
    </div>
    
    <div id="menuDelete" class="container tab-pane fade"><br>
      <h3>Remove a person in the database</h3>
    </div>
  </div>
</div>
	
	
	<script type="text/javascript" src="static/js/my.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script type="text/javascript" src="static/js/bootstrap.js"></script>
	

</body>
</html>