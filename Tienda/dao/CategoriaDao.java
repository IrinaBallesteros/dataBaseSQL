����   7 *  *com/latam/byjulisa/tienda/dao/CategoriaDao  java/lang/Object em !Ljavax/persistence/EntityManager; <init> $(Ljavax/persistence/EntityManager;)V Code
     ()V	     LineNumberTable LocalVariableTable this ,Lcom/latam/byjulisa/tienda/dao/CategoriaDao; guardar /(Lcom/latam/byjulisa/tienda/modelo/Categoria;)V    javax/persistence/EntityManager   persist (Ljava/lang/Object;)V 	categoria ,Lcom/latam/byjulisa/tienda/modelo/Categoria; 
actualizar     ! merge &(Ljava/lang/Object;)Ljava/lang/Object; remover $ *com/latam/byjulisa/tienda/modelo/Categoria  & '  remove 
SourceFile CategoriaDao.java !                	   F     
*� 
*+� �              	         
       
        	   C     *� +�  �       
     
                        	   D     *� +�  W�       
                          "   	   U     *� +�  � #L*� +� % �                                   (    )