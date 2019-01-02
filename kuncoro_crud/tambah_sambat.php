<?php
	include "koneksi.php";
	
	$isi_sambat 	= $_POST['isi_sambat'];
	$saran		    = $_POST['saran'];
	
	class emp{}
	
	if (empty($isi_sambat) || empty($saran)) { 
		$response = new emp();
		$response->success = 0;
		$response->message = "Kolom isian tidak boleh kosong"; 
		die(json_encode($response));
	} else {
		$query = mysql_query("INSERT INTO sambat (id_sambat,isi_sambat,saran) VALUES(0,'".$isi_sambat."','".$saran."')");
		
		if ($query) {
			$response = new emp();
			$response->success = 1;
			$response->message = "Data berhasil di simpan";
			die(json_encode($response));
		} else{ 
			$response = new emp();
			$response->success = 0;
			$response->message = "Error simpan Data";
			die(json_encode($response)); 
		}	
	}
?>