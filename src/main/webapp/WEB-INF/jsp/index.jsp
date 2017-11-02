<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>ToDo List App</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>ID</th>
        <th>TITLE</th>

        <th>PRIORITY</th>
        <th>STATUS</th>
        <th>ACTION</th>
    </tr>
    <c:forEach var = "list" items = "${lists}">
        <tr>
            <td>${list.id}</td>
            <td>${list.title}</td>

            <td>${list.priority}</td>
            <td>${list.status}</td>
            <td>
                <a href="/view/${list.id}">View</a>
                <a href="/delete/${list.id}">Delete</a>
                <a href="/edit/${list.id}">Edit</a>

            </td>
        </tr>
    </c:forEach>
</table>
<hr/>
<form method="post" action="/save">
    <input type="hidden" name="id" value=""/>
    Title name:<br>
    <input type="text" name="title"/>
    <br>
    Priority:<br>
    <select name="priority" type="text"> <option></option>
        <option>HIGH</option>
        <option>MEDIUM</option>

        <option>LOW</option></select>


    <!--  <input type="text" name="priority"/>  -->
    <br>
    Status:<br>

    <select name="status" type="text"> <option></option>
        <option>TODO</option>
        <option>DONE</option>
        <option>IN PROGRESS</option></select>
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>