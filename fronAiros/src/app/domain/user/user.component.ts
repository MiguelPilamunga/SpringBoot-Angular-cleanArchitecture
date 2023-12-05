import {Component, EventEmitter, Input, Output} from '@angular/core';
import { CommonModule } from '@angular/common';
import {RatingComponent} from "./rating/rating.component";

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule,RatingComponent],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
})
export class UserComponent {
  @Input({required: true}) image: string = '';
  @Input({required:true}) name: string = '';
  @Input({required:true}) lastname: string = '';

  @Output() look_description= new EventEmitter();

  lookDescriptionHandler() {
    console.log("este es el hijo");
    this.look_description.emit('funciona' );
  }

}
