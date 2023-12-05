import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserComponent } from './../user/user.component';
@Component({
  selector: 'app-userlist',
  standalone: true,
  imports: [CommonModule, UserComponent],
  templateUrl: './userlist.component.html',
  styleUrl: './userlist.component.css',
})
export class UserlistComponent {

  from_user_component(event: string){
    console.log("funciona y estamos en el padre ");
    console.log(event);
  }
}
