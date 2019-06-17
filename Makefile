build:
	mkdir build
	mkdir build/go
	mkdir build/java
	# for Go
	protoc -I . bolg/type/empty.proto --go_out=plugins=grpc:build/go
	protoc -I . bolg/hello/v1/hello.proto --go_out=plugins=grpc:build/go
	# for Java
	protoc -I . bolg/type/empty.proto --grpc-java_out=lite:build/java --java_out=build/java --plugin=protoc-gen-grpc-java=/usr/local/bin/protoc-gen-grpc-java
	protoc -I . bolg/hello/v1/hello.proto --grpc-java_out=lite:build/java --java_out=build/java --plugin=protoc-gen-grpc-java=/usr/local/bin/protoc-gen-grpc-java

clean:
	rm -rf build
