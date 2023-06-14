package com.controllers;

import com.config.DbConnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbController {
    public static void getDatabase() {
        DbConnect.connection();
        try {
            DbConnect.statement = DbConnect.connect.createStatement();
            DbConnect.resultset = DbConnect.statement.executeQuery("SELECT * FROM `db_barang`");

            while (DbConnect.resultset.next()) {
                String id = DbConnect.resultset.getString("ID");
                String nama = DbConnect.resultset.getString("Nama");
                String harga = DbConnect.resultset.getString("Harga");
                String jumlah = DbConnect.resultset.getString("Jumlah");

                System.out.println("(" + id + ") " + nama + ": Rp." + harga + " (" + jumlah + ")");
            }
            DbConnect.resultset.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String nama, long harga, int jumlah) {
        DbConnect.connection();

        try {
            PreparedStatement preparedStatement = DbConnect.connect.prepareStatement("INSERT INTO `db_barang` (`ID`, `Nama`, `Harga`, `Jumlah`) VALUES (NULL, ?, ?, ?)");
            preparedStatement.setString(1, nama);
            preparedStatement.setLong(2, harga);
            preparedStatement.setInt(3, jumlah);

            preparedStatement.executeUpdate();

            System.out.println("Data berhasil di simpan");

            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editData(int id, String namaBaru, long hargaBaru, int jumlahBaru) {
        DbConnect.connection();

        try {
            PreparedStatement preparedStatement = DbConnect.connect.prepareStatement("UPDATE `db_barang` SET `Nama` = ?, `Harga` = ?, `Jumlah` = ? WHERE `db_barang`.`ID` = ?");
            preparedStatement.setString(1, namaBaru);
            preparedStatement.setLong(2, hargaBaru);
            preparedStatement.setInt(3, jumlahBaru);
            preparedStatement.setInt(4, id);

            preparedStatement.executeUpdate();

            System.out.println("Data berhasil di Update");

            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(int id) {
        DbConnect.connection();
        try {
            PreparedStatement preparedStatement = DbConnect.connect.prepareStatement("DELETE FROM `db_barang` WHERE `ID` = ?");
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

            System.out.println("Data berhasil dihapus");

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
