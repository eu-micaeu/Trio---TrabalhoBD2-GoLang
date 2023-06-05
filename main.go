package main

import (
	"projetobd2/database"
	"projetobd2/rotas"
)

func main() {
	database.Banco()
	rotas.Servidor()
	
}
