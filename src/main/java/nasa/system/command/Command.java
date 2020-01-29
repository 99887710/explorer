package nasa.system.command;

public class Command {
    private CmdType cmdType;
    private RobotPosCmd robotPosCmd;
    private RobotActionCmd robotActionCmd;

    public CmdType getCmdType() {
        return cmdType;
    }

    public void setCmdType(CmdType cmdType) {
        this.cmdType = cmdType;
    }

    public RobotPosCmd getRobotPosCmd() {
        return robotPosCmd;
    }

    public void setRobotPosCmd(RobotPosCmd robotPosCmd) {
        this.robotPosCmd = robotPosCmd;
    }

    public RobotActionCmd getRobotActionCmd() {
        return robotActionCmd;
    }

    public void setRobotActionCmd(RobotActionCmd robotActionCmd) {
        this.robotActionCmd = robotActionCmd;
    }
}
