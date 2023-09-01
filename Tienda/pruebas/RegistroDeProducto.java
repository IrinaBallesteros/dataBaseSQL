����   7   4com/latam/byjulisa/tienda/pruebas/RegistroDeProducto  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 6Lcom/latam/byjulisa/tienda/pruebas/RegistroDeProducto; main ([Ljava/lang/String;)V
     registrarProducto
    (com/latam/byjulisa/tienda/utils/JPAUtils   getEntityManager #()Ljavax/persistence/EntityManager;  )com/latam/byjulisa/tienda/dao/ProductoDao
     $(Ljavax/persistence/EntityManager;)V
  !   java/lang/Long " # valueOf (J)Ljava/lang/Long;
  % & ' consultaPorId =(Ljava/lang/Long;)Lcom/latam/byjulisa/tienda/modelo/Producto;	 ) + * java/lang/System , - out Ljava/io/PrintStream;
 / 1 0 )com/latam/byjulisa/tienda/modelo/Producto 2 3 	getNombre ()Ljava/lang/String;
 5 7 6 java/io/PrintStream 8 9 println (Ljava/lang/String;)V ; Samsung
  = > ? "consultarPrecioPorNombreDeProducto *(Ljava/lang/String;)Ljava/math/BigDecimal;
 5 A 8 B (Ljava/lang/Object;)V args [Ljava/lang/String; em !Ljavax/persistence/EntityManager; productoDao +Lcom/latam/byjulisa/tienda/dao/ProductoDao; producto +Lcom/latam/byjulisa/tienda/modelo/Producto; precio Ljava/math/BigDecimal; N *com/latam/byjulisa/tienda/modelo/Categoria P 	CELULARES
 M R  9 T telefono usado en buen estado V java/math/BigDecimal X 1000
 U R
 / [  \ i(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/latam/byjulisa/tienda/modelo/Categoria;)V ^ *com/latam/byjulisa/tienda/dao/CategoriaDao
 ]  a c b javax/persistence/EntityManager d e getTransaction '()Ljavax/persistence/EntityTransaction; g i h #javax/persistence/EntityTransaction j  begin
 ] l m n guardar /(Lcom/latam/byjulisa/tienda/modelo/Categoria;)V
  p m q .(Lcom/latam/byjulisa/tienda/modelo/Producto;)V g s t  commit a v w  close 	celulares ,Lcom/latam/byjulisa/tienda/modelo/Categoria; celular categoriaDao ,Lcom/latam/byjulisa/tienda/dao/CategoriaDao; 
SourceFile RegistroDeProducto.java !               /     *� �    
                    	       �     4� � L� Y+� M,
� � $N� (-� .� 4,:� <:� (� @�    
   "             #  +  3     4    4 C D    - E F   $ G H    I J  + 	 K L  
       �     _� MYO� QK� /Y:S� UYW� Y*� ZL� M� Y,� N� ]Y,� _:,� ` � f *� k-+� o,� ` � r ,� u �    
   .     
      $ ! - " 7 $ B & H ' M ) X * ^ +    4  
 U x y     ? z J  $ ; E F  - 2 G H  7 ( { |   }    ~