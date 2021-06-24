const app = {
    data() {
        return {
            show: false,
            vaccenter:'',
            comment:'',
            grade:''
        }
    },
template:` 
<div class="headbuttons">
    <button @click="show = !show" type="submit" class="btn btn-primary">Bewertung abgeben</button>
</div>
<transition name="bounce">
    <div v-if="show" class="my-container">
        <div class="panel panel-primary">
            <div class="panel-heading">Bewertung abgeben</div>
            <div class="panel-body">
                <div class='my-col-md-6'>
                    <label>Impfzentrum auswählen: </label>
                    <div id="location">
                        <select v-model="vaccenter" required>
                            <option value="" disabled selected>Bitte Impfzentrum auswählen...</option>
                            <option value="Impfzentrum Arena">Impfzentrum Arena</option>
                            <option value="Impfzentrum Erika-Heß-Eisstadion">Impfzentrum Erika-Heß-Eisstadion</option>
                            <option value="Impfzentrum Flughafen Tegel">Impfzentrum Flughafen Tegel</option>
                            <option value="Impfzentrum Flughafen Tempelhof">Impfzentrum Flughafen Tempelhof</option>
                            <option value="Impfzentrum Messe">Impfzentrum Messe</option>
                            <option value="Impfzentrum Velodrom">Impfzentrum Velodrom</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class='my-col-md-6'>
                <label class="control-label">Kommentar: </label>
                <div class="form-group">
                    <textarea  v-model="comment" style="resize: none" rows="4" cols="30"></textarea>
                </div>
            </div>
            <div class='my-col-md-6'>
                <label>Note wählen: </label>
                <div id="bewertung">
                    <select  v-model="grade">
                        <option value="" disabled selected>Bitte Note vergeben...</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                    </select>
                </div>
            </div>
            <div class="einreichen">
                <input type="submit" class="btn btn-primary" @click="save()" value="Bewertung einreichen">
            </div>
        </div>
    </div>
</transition>
`,
methods:{
    save() {
        axios.post('/rating', {
            vaccenter: this.vaccenter,
            comment: this.comment,
            grade: this.grade
        })
            .then((response) => {
                this.vaccenter = '';
                this.comment = '';
                this.grade = '';
            }, (error) => {
                console.log('Rating konnte nicht gespeichert werden');
            });

    }
}

}

Vue.createApp(app).mount('#app')

