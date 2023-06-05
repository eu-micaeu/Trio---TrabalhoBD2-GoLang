package rotas

import (
	"fmt"
	"log"
	"net/http"
)

func Servidor() {
	filePath := "./index.html"

	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, filePath)
	})

	port := ":8081"
	fmt.Printf("Servidor rodando em http://localhost%s\n", port)
	log.Fatal(http.ListenAndServe(port, nil))
}
