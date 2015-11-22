<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="col-lg-6">
    <form:form id="myForm" method="post" action="/user/sign-up/" class="bs-example form-horizontal">
        <fieldset>
            <legend>Signup Form</legend>
            <div class="form-group">
                <label for="userNameInput" class="col-lg-3 control-label">Login</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" name="login"
                           id="userNameInput" placeholder="Login"
                           value="${it.student.userName}"/>
                </div>
            </div>

            <div class="form-group">
                <label for="passwordInput" class="col-lg-3 control-label">Password</label>

                <div class="col-lg-9">
                    <input type="password" class="form-control" name="password"
                           id="passwordInput" placeholder="Password"
                           value="${it.student.password}"/>
                </div>
            </div>

            <div class="form-group">
                <label for="firstNameInput" class="col-lg-3 control-label">First Name</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" name="firstName"
                           id="firstNameInput" placeholder="First Name"
                           value="${it.student.firstName}"/>
                </div>
            </div>

            <div class="form-group">
                <label for="emailAddressInput" class="col-lg-3 control-label">Email Address</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" name="email"
                           id="emailAddressInput" placeholder="Email Address"
                           value="${it.student.emailAddress}"/>
                </div>
            </div>

            <div class="col-lg-9 col-lg-offset-3">
                <button class="btn btn-default">Cancel</button>
                <button class="btn btn-primary" data-toggle="modal" data-target="#themodal">Submit</button>

                <div id="themodal" class="modal fade" data-backdrop="static">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"
                                        aria-hidden="true">&times;</button>
                                <h3>Signup Form Submission</h3>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure you want to do this?</p>

                                <div class="progress progress-striped active">
                                    <div id="doitprogress" class="progress-bar"></div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <a href="#" class="btn btn-default" data-dismiss="modal">Close</a>
                                <input type="submit" value="Yes" id="yesbutton"
                                       class="btn btn-primary" data-loading-text="Saving.."
                                       data-complete-text="Submit Complete!">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </fieldset>
    </form:form>
</div>

<script type="text/javascript">
    $(function () {
        var yesButton = $("#yesbutton");
        var progress = $("#doitprogress");
        yesButton.click(function () {
            yesButton.button("loading");
            var counter = 0;
            var countDown = function () {
                counter++;
                if (counter == 11) {
                    yesButton.button("complete");
                } else {
                    progress.width(counter * 10 + "%");
                    setTimeout(countDown, 100);
                }
            };
            setTimeout(countDown, 100);
        });
    });
</script>