<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Poc</title>
<style type="text/css">
#forms{
background-color: gray;
}
* {
  box-sizing: border-box;
}
#main{
positin: inline;
width: 450px;
height: auto;
margin: auto;
background-color: gray;
}

#main>div{
float: left;
margin: 10px;
}

#label{
width: 150px;
height:20px;
}


#sel{
width:150px;
height:20px;
margin:3px;
}

input[type=text]{
width:100%;
}

input[type=submit]{
background-color: #564218;
border-radius: 8px;
border: none;
 color: white;
 padding: 8px 10px;
}

input[type=submit]:hover
{
background-color: #45a049;
}
input[type=reset]{
background-color: #562348;
border-radius: 8px;
border: none;
 color: white;
 padding: 8px 10px;
}


input[type=reset]:hover
{
background-color: red;
}

</style>
</head>
<body id="forms">
	<form action="process" method="post" >
		<div id="main">
			<div id="label">Costomer Name:</div>
			<div id="sel">
				<input type="text" name="customerName">
			</div>

			<div id="label">Customer Type:</div>
			<div id="sel">
				<select name="customerType">
					<option value="company">Company</option>
					<option value="individual">Individual</option>
					<option value="government">Government</option>
				</select>
			</div>

			<div id="label">Item Type:</div>
			<div id="sel">
				<select name="itemType">
					<option value="company">Mobile</option>
					<option value="individual">Automobile</option>
					<option value="Cloths">Cloths</option>
					<option value="Cosmetics">Cosmetics</option>
					<option value="Jewellers">Jewellers</option>
					<option value="Computers">Computers</option>
					<option value="HomeAppliences">HomeAppliences</option>
				</select>
			</div>
			<div id="label">Imported From:</div>
			<div id="sel">
				<select name="importedFrom">
					<option value="America">America</option>
					<option value="England">England</option>
					<option value="Singapore">Singapore</option>
					<option value="Canada">Canada</option>
					<option value="australia">australia</option>
					<option value="SwitzerLand">SwitzerLand</option>
				</select>
			</div>

			<div id="label">Quantity:</div>
			<div id="sel">
				<input type="number" name="quantity">
			</div>

			<div id="label">Date of Arrival : </div>
			<div id="sel">
				<input type="date" name="dateOfArrival">
			</div>
			<div id="sel">
				<input type="submit" value="Process">
			</div>
			<div id="sel">
				<input type="reset" value="Cancel">
			</div>
		</div>

	</form>

</body>
</html>