package main

import (
	"projetobd2/database"
	"projetobd2/http"
)

func main() {
	database.Banco()
	http.Servidor()
}
