import {Component, OnInit} from '@angular/core';
import {Matches} from '../../models/matches.model';
import {MatchesService} from '../../services/matches.service';

@Component({
  selector: 'app-matches-list',
  standalone: false,
  templateUrl: './matches-list.component.html',
  styleUrl: './matches-list.component.css'
})
export class MatchesListComponent implements OnInit{

  matches: Matches[] = [];

  constructor(private matchesService: MatchesService) {
  }

  ngOnInit() {
    this.matchesService.getAll().subscribe(data => {
      this.matches = data;
    })
  }
}
