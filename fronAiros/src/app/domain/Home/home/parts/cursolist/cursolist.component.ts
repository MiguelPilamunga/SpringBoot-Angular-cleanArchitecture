import {Component, numberAttribute} from '@angular/core';
import { CommonModule } from '@angular/common';
import {CursoComponent} from "./curso/curso.component";
import {UserComponent} from "../../../../user/user.component";
import {BuscadorComponent} from "./buscador/buscador.component";
@Component({
  selector: 'app-cursolist',
  standalone: true,
  imports: [CommonModule, CursoComponent, UserComponent, BuscadorComponent],
  templateUrl: './cursolist.component.html',
  styleUrl: './cursolist.component.css'
})
export class CursolistComponent {
  items = new Array();

  additemtoCart(item: string){
    this.items.push(item);
  }
  curso = {
    image: 'https://picsum.photos/600/600?random=1',
    title: 'Aplicaciones web con Angular',
    popularized: 5,
    description: 'En este curso, aprenderás a crear aplicaciones web complejas y atractivas con Angular. Comenzarás con los conceptos básicos de Angular, como componentes, directivas y servicios. Luego, aprenderás a crear aplicaciones completas, desde la interfaz de usuario hasta la lógica empresarial. Al final de este curso, estarás listo para crear tus propias aplicaciones Angular.'
  }

  curso2 = {
    image: 'https://picsum.photos/600/600?random=2',
    title: 'Angular para principiantes',
    popularized: 5,
    description: 'En este curso, aprenderás los fundamentos de Angular, un marco de desarrollo de aplicaciones web moderno y potente. Comenzarás con una introducción a Angular, luego aprenderás a crear componentes, directivas y servicios. También aprenderás a usar Angular Material para crear interfaces de usuario atractivas. Al final de este curso, estarás listo para comenzar a crear tus propias aplicaciones Angular.'
  }

  curso3 = {
    image: 'https://picsum.photos/600/600?random=3',
    title: 'Angular avanzado',
    popularized: 5,
    description: 'En este curso, aprenderás técnicas avanzadas de Angular, como manipulación de datos, navegación y pruebas. También aprenderás a usar Angular con otros frameworks y bibliotecas, como Node.js, Express y MongoDB. Al final de este curso, estarás listo para crear aplicaciones Angular complejas y escalables.'
  }


  cursos = [this.curso, this.curso2, this.curso3];


}
