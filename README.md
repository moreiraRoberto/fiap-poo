Sistema de Controle de Consumo de Água

Meu objetivo é simular um sistema que auxilia usuários no controle de sua hidratação diária. se baseando em um consumo de 1litro por dia.

Escolhi como objeto do mundo real a "GarrafaAgua", onde armazeno informações como Marca, o Material, a Capacidade de Agua e com isso conseguimos gerenciar o volume de água disponível para consumo.

A classe `GarrafaAgua` possui c1 metodos específicos : 

saldogarrafa: Responsável por "recarregar" o saldo da água garrafa, validando se o valor inserido é positivo e atualizando com o saldo atual de água.
qtaguadiaria: Neste comparamos a a capacidade da garrafa com a meta de consumo diário (ex: 1 litro). Ele alerta o usuário se ele precisará consumir mais de uma garrafa para atingir seu objetivo.

