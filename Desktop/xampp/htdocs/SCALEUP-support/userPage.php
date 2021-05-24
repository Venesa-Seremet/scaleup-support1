<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h2>Sample files</h2>
	<table>
		<thead>
			<th>File name</th>
			<th>Action</th>
		</thead>
		<tbody>
		<?php
			include('db_conn.php');       
            $userId=urldecode($_REQUEST['id']);
          
        
 
			$query=mysqli_query($conn,"select * from file where user=".$userId);

			while($row=mysqli_fetch_array($query)){
    
				?>
					<tr>
						<td><?php echo $row['name']; ?></td>
						<td><a href="/download.php?file=<?php echo urlencode($row['file_location']); ?>">Download</a></td>
					</tr>
				<?php
			}
		?>
		</tbody>
	</table>
</body>
</html>