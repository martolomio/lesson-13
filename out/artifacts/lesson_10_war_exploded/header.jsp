<link rel="stylesheet" href="css/header.css">


<%--<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">--%>
<%--<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>--%>
<%--<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
<!------ Include the above in your HEAD tag ---------->

<div id="wrapper" class="animate">
    <nav class="navbar header-top fixed-top navbar-expand-lg  navbar-dark bg-dark">
        <span class="navbar-toggler-icon leftmenutrigger"></span>
        <a class="navbar-brand" href="#">Periodicals</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
                aria-controls="navbarText"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav animate side-nav">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/cabinet.jsp">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item create-product-option">
                    <a class="nav-link" href="${pageContext.request.contextPath}/createProduct.jsp">Add Periodical</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/bucket.jsp">Bucket</a>
                </li>
            </ul>
            <%--            <ul class="navbar-nav ml-md-auto d-md-flex">--%>
            <%--                <li class="nav-item">--%>
            <%--                    <a class="nav-link" href="#">Home--%>
            <%--                        <span class="sr-only">(current)</span>--%>
            <%--                    </a>--%>
            <%--                </li>--%>
            <%--                <li class="nav-item">--%>
            <%--                    <a class="nav-link" href="#">Top Menu Items</a>--%>
            <%--                </li>--%>
            <%--                <li class="nav-item">--%>
            <%--                    <a class="nav-link" href="#">Pricing</a>--%>
            <%--                </li>--%>
            <%--            </ul>--%>
            <ul class="navbar-nav ml-md-auto d-md-flex">
                <li class="nav-item">
                    <button class="nav-link product-Logout" style="background-color: lightseagreen">LogOut</button>
                </li>
            </ul>
        </div>
    </nav>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"
        integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF"
        crossorigin="anonymous"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"
        integrity="sha512-bLT0Qm9VnAYZDflyKcBaQ2gg0hSYNQrJ8RilYldYQ1FxQYoCLtUjuuRuZo+fjqhx/qtq/1itJ0C2ejDxltZVFg=="
        crossorigin="anonymous"></script>

