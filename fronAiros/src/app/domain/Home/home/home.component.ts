import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {NavbarComponent} from './parts/navbar/navbar.component';
import {CursolistComponent} from './parts/cursolist/cursolist.component';
import {CarrouselComponent} from './parts/carrousel/carrousel.component';
import {FooterComponent} from './parts/footer/footer.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, NavbarComponent, CursolistComponent,FooterComponent, CarrouselComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  isLoggedIn = false;
}
