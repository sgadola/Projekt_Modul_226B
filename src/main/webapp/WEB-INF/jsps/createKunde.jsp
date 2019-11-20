<%@ page %>

<html>
<head>
    <title>Neuen Kunden erfassen</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
<h2>Neuen Kunden erfassen</h2>
<hr>
Bitte geben sie alle Daten ein um einen neuen Kunden zu erfassen:<br>
<br>
<form action="saveKunde" method="POST">
    <table>
        <!-- <tr>
            <td><label for="id">ID: </label></td>
            <td><input type="text" name="id" id="id" required></td>
        </tr> -->
        <tr>
            <td><label for="vorname">Vorname: </label></td>
            <td><input type="text" name="vorname" id="vorname" required></td>
        </tr>
        <tr>
            <td><label for="nachname">Nachname: </label></td>
            <td><input type="text" name="nachname" id="nachname" required></td>
        </tr>
        <tr>
            <td><label for="anrede">Anrede: </label></td>
            <!-- TODO: Change to radio or pref. dropdown -->
            <td><input type="text" name="anrede" id="anrede" required></td>
        </tr>
        <tr>
            <td><label for="alter">Alter: </label></td>
            <td><input type="text" name="alter" id="alter" required></td>
        </tr>
        <tr>
            <td><label for="geschlecht">Geschlecht: </label></td>
            <!-- TODO: Change to radio or pref. dropdown -->
            <td><input type="text" name="geschlecht" id="geschlecht" required></td>
        </tr>
    </table>
    <input type="submit" value="Speichern">
    <button type="submit">Speichern [Button]</button>

    <hr>

    <a href="displayKunden">Vorhandene Kunden Eintr&auml;ge anzeigen</a>
</form>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>