<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="col-lg-6">
    <form:form id="myForm" method="post" action="/user/sign-in/" class="bs-example form-horizontal">
        <c:if test="${param.err != null}">
            <div class="alert alert-danger">
                <p>Invalid username and password.</p>
            </div>
        </c:if>
        <c:if test="${param.out != null}">
            <div class="alert alert-success">
                <p>You have been logged out successfully.</p>
            </div>
        </c:if>
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