package database

import (
	"database/sql"
	"fmt"

	_ "github.com/lib/pq"
)

func Banco() {
	dbName := "Projeto"
	dbUser := "usuario"
	dbPassword := "usuario"
	dbHost := "localhost"
	dbPort := 5432

	connStr := fmt.Sprintf("host=%s port=%d user=%s password=%s dbname=%s sslmode=disable", dbHost, dbPort, dbUser, dbPassword, dbName)

	db, err := sql.Open("postgres", connStr)
	if err != nil {
		fmt.Println("Erro ao conectar-se ao banco de dados:", err)
		return
	}
	defer db.Close()

	fmt.Println("Conexão com o banco de dados estabelecida com sucesso!")

	rows, err := db.Query("SELECT * FROM carro_cliente")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer rows.Close()

	for rows.Next() {
		var col1, col2, col3 string
		err := rows.Scan(&col1, &col2, &col3)
		if err != nil {
			fmt.Println(err)
			return
		}
		fmt.Println(col1 + "/" + col2 + "/" + col3)
	}

	if err = rows.Err(); err != nil {
		fmt.Println(err)
	}
}
