def server = vertx.createHttpServer()
def port = System.getenv('PORT') != null ? System.getenv('PORT') as int : 8080
 
server.requestHandler { request ->
  request.response.putHeader("Content-Type", "text/plain")
  request.response.end("hello, world")
}

server.listen(port, '0.0.0.0')
