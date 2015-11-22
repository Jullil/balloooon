<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>${pageTitle}</title>
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/assets/css/bootstrap-united.css" rel="stylesheet"/>

    <script src="/webjars/jquery/jquery.min.js" type="text/javascript"></script>
    <script src="/webjars/bootstrap/js/bootstrap.js" type="text/javascript"></script>
</head>
<body>

<div class="navbar navbar-default">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
                data-target=".navbar-responsive-collapse">
            <span class="icon-bar"></span> <span class="icon-bar"></span> <span
                class="icon-bar"></span>
        </button>
    </div>

    <div class="navbar-collapse collapse navbar-responsive-collapse">
        <jsp:include page="main_menu.jsp"/>
    </div>
</div>

<div class="col-lg-6 col-lg-offset-3">
    <div class="well">
        <div class="container">
            <div class="row">
                <jsp:include page="${partialView}.jsp"/>
            </div>
        </div>
    </div>
</div>

</body>
</html>
