import {Component, EventEmitter, Input, Output} from '@angular/core';
import { CommonModule } from '@angular/common';
import {RatingComponent} from "../../../../../user/rating/rating.component";

@Component({
  selector: 'app-curso',
  standalone: true,
  imports: [CommonModule, RatingComponent, RatingComponent],
  templateUrl: './curso.component.html',
  styleUrl: './curso.component.css'
})
export class CursoComponent {

  @Input({required: true}) image: string = '';
  @Input({required:true}) title: string = '';
  @Input({required:true}) description: string = '';

  @Output()  addItemsToCart = new EventEmitter<string>();

  additemtoCart(){
    this.addItemsToCart.emit(this.title);
  }

}
