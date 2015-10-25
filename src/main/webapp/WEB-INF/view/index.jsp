<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

<spring:url value="/webjars/bootstrap/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/css/main.css" var="mainCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${mainCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Project Name</a>
	</div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
	<p>
		<c:if test="${not empty msg}">
			Hello ${msg}
		</c:if>

		<c:if test="${empty msg}">
			Welcome Welcome!
		</c:if>
        </p>
        <p>
		<a class="btn btn-primary btn-lg" 
                    href="#" role="button">Learn more</a>
	</p>
	</div>
</div>

<div class="container">

  <div class="row">
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>ABC</p>
		<p>
			<a class="btn btn-default" href="#" role="button">View details</a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>ABC</p>
		<p>
			<a class="btn btn-default" href="#" role="button">View details</a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>ABC</p>
		<p>
			<a class="btn btn-default" href="#" role="button">View details</a>
		</p>
	</div>
  </div>


  <hr />
  <footer>
	<p>© Mkyong.com 2015</p>
  </footer>
</div>

<spring:url value="/webjars/jquery/jquery.min.js" var="jQueryJs" />
<spring:url value="/webjars/bootstrap/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${jQueryJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>