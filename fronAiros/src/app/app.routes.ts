import { Routes } from '@angular/router';
import { UserlistComponent } from './domain/userlist/userlist.component';
import  {HomeComponent} from  './domain/Home/home/home.component';
export const routes: Routes = [
  {
    path: '',
    component: UserlistComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
  },
];
