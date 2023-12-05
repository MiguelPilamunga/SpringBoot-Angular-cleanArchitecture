import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { UserlistComponent } from './domain/userlist/userlist.component';
import {HomeComponent} from "./domain/Home/home/home.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, UserlistComponent, HomeComponent],
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'fronAiros';
}
