import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsuarioListComponent } from './components/usuario-list/usuario-list.component';
import { HabilidadServicioListComponent } from './components/habilidad-servicio-list/habilidad-servicio-list.component';
import {SubcategoriaListComponent} from './components/subcategoria-list/subcategoria-list.component';
import {EvaluacionListComponent} from './components/evaluacion-list/evaluacion-list.component';
import {CategoriaListComponent} from './components/categoria-list/categoria-list.component';
import {MensajeListComponent} from './components/mensaje-list/mensaje-list.component';
import {MatchesListComponent} from './components/matches-list/matches-list.component';

const routes: Routes = [
  {path: '', redirectTo: 'usuarios', pathMatch: 'full'},
  {path: 'usuarios', component: UsuarioListComponent},
  {path: 'habilidades-servicios', component: HabilidadServicioListComponent},
  {path: 'subcategorias', component: SubcategoriaListComponent},
  {path: 'evaluaciones', component: EvaluacionListComponent},
  {path: 'categorias', component: CategoriaListComponent},
  {path: 'mensajes', component: MensajeListComponent},
  {path: 'matches', component: MatchesListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
