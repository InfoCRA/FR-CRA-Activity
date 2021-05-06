package fr.infocom.cra.activity.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Activity {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int collaboratorId;
	private int projectId;
	private Date startDate;
	private double duration;
	private boolean remote;
	
	@ManyToOne
	private TypeActivity typeActivity;
	
	
	public Activity(){}

	public Activity(int id, int collaboratorId, int projectId, Date startDate, double duration, boolean remote,
			TypeActivity typeActivity) {
		super();
		this.id = id;
		this.collaboratorId = collaboratorId;
		this.projectId = projectId;
		this.startDate = startDate;
		this.duration = duration;
		this.remote = remote;
		this.typeActivity = typeActivity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCollaboratorId() {
		return collaboratorId;
	}

	public void setCollaboratorId(int collaboratorId) {
		this.collaboratorId = collaboratorId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	public TypeActivity getTypeActivity() {
		return typeActivity;
	}

	public void setTypeActivity(TypeActivity typeActivity) {
		this.typeActivity = typeActivity;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", collaboratorId=" + collaboratorId + ", projectId=" + projectId + ", startDate="
				+ startDate + ", duration=" + duration + ", remote=" + remote + ", typeActivity=" + typeActivity + "]";
	}
	
	
}
