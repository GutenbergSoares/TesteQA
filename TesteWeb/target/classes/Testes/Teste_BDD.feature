#language:pt

Funcionalidade: Busca de carros
Eu como usuario 
Quero fazer busca por carro (Marca, Modelo, Versão)
Para buscar carros


Cenário: Trazer busca com sucesso
	Dado que estou no site da WebMotors como comprador
	Quando eu fizer a busca por um determinado veiculo
	Então serão exibidos os resultados de busca de veiculo