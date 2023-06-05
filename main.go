package main

import (
	"projetobd2/database"
	"projetobd2/routes"
)

func main() {
	database.Banco()
	routes.Servidor()
	
}
