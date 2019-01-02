<?php
	include "koneksi.php";
	
	$id_sambat 	= $_POST['id_sambat'];
	$isi_sambat 	= $_POST['isi_sambat'];
	$saran = $_POST['saran'];
	
	class emp{}
	
	if (empty($id_sambat) || empty($isi_sambat) || empty($saran)) { 
		$response = new emp();
		$response->success = 0;
		$response->message = "Kolom isian tidak boleh kosong"; 
		die(json_encode($response));
	} else {
		$query = mysql_query("UPDATE sambat SET isi_sambat='".$isi_sambat."', saran='".$saran."' WHERE id_sambat='".$id_sambat."'");
		
		if ($query) {
			$response = new emp();
			$response->success = 1;
			$response->message = "Data berhasil di update";
			die(json_encode($response));
		} else{ 
			$response = new emp();
			$response->success = 0;
			$response->message = "Error update Data";
			die(json_encode($response)); 
		}	
	}
?>