// Generated from D:/tugas/sem7/rpsld/ClassSchedulingDSL/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScheduleParser}.
 */
public interface ScheduleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#jadwal}.
	 * @param ctx the parse tree
	 */
	void enterJadwal(ScheduleParser.JadwalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#jadwal}.
	 * @param ctx the parse tree
	 */
	void exitJadwal(ScheduleParser.JadwalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#hari}.
	 * @param ctx the parse tree
	 */
	void enterHari(ScheduleParser.HariContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#hari}.
	 * @param ctx the parse tree
	 */
	void exitHari(ScheduleParser.HariContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#jam}.
	 * @param ctx the parse tree
	 */
	void enterJam(ScheduleParser.JamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#jam}.
	 * @param ctx the parse tree
	 */
	void exitJam(ScheduleParser.JamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#ruangan}.
	 * @param ctx the parse tree
	 */
	void enterRuangan(ScheduleParser.RuanganContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#ruangan}.
	 * @param ctx the parse tree
	 */
	void exitRuangan(ScheduleParser.RuanganContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#konfigurasi}.
	 * @param ctx the parse tree
	 */
	void enterKonfigurasi(ScheduleParser.KonfigurasiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#konfigurasi}.
	 * @param ctx the parse tree
	 */
	void exitKonfigurasi(ScheduleParser.KonfigurasiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#matkul}.
	 * @param ctx the parse tree
	 */
	void enterMatkul(ScheduleParser.MatkulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#matkul}.
	 * @param ctx the parse tree
	 */
	void exitMatkul(ScheduleParser.MatkulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#preforw}.
	 * @param ctx the parse tree
	 */
	void enterPreforw(ScheduleParser.PreforwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#preforw}.
	 * @param ctx the parse tree
	 */
	void exitPreforw(ScheduleParser.PreforwContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#kapasitas}.
	 * @param ctx the parse tree
	 */
	void enterKapasitas(ScheduleParser.KapasitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#kapasitas}.
	 * @param ctx the parse tree
	 */
	void exitKapasitas(ScheduleParser.KapasitasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#fasilitas}.
	 * @param ctx the parse tree
	 */
	void enterFasilitas(ScheduleParser.FasilitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#fasilitas}.
	 * @param ctx the parse tree
	 */
	void exitFasilitas(ScheduleParser.FasilitasContext ctx);
}