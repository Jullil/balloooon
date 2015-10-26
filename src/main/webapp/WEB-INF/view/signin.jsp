<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Sign in</title>
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/assets/css/bootstrap-united.css" rel="stylesheet"/>

    <style type="text/css">
        .error {
            color: #ff0000;
            font-size: 0.9em;
            font-weight: bold;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
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
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/">Home</a></li>
            <li class="active"><a href="/user/sign-up">Signup</a></li>
            <li><a href="/user/sign-in">Login</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Explore<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Contact us</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Further Actions</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <!-- /.nav-collapse -->
</div>

<div class="col-lg-6 col-lg-offset-3">
    <div class="well">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <form:form id="myForm" method="post" action="/user/sign-in/" class="bs-example form-horizontal">
                        <fieldset>
                            <legend>Sign In Form</legend>
                            <div class="form-group">
                                <label for="userNameInput" class="col-lg-3 control-label">User Name</label>

                                <div class="col-lg-9">
                                    <input type="text" class="form-control" name="login"
                                           id="userNameInput" placeholder="User Name"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="passwordInput" class="col-lg-3 control-label">Password</label>

                                <div class="col-lg-9">
                                    <input type="password" class="form-control"
                                           name="password" id="passwordInput" placeholder="Password"/>
                                </div>
                            </div>

                            <div class="col-lg-9 col-lg-offset-3">
                                <button class="btn btn-default">Cancel</button>
                                <button class="btn btn-primary">Login</button>
                            </div>
                        </fieldset>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/webjars/jquery/jquery.min.js" type="text/javascript"></script>
<script src="/webjars/bootstrap/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>