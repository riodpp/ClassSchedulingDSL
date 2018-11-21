// Generated from D:/tugas/sem7/rpsld/ClassSchedulingDSL/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScheduleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScheduleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#jadwal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJadwal(ScheduleParser.JadwalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#hari}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHari(ScheduleParser.HariContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#jam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJam(ScheduleParser.JamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#ruangan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuangan(ScheduleParser.RuanganContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#konfigurasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKonfigurasi(ScheduleParser.KonfigurasiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#matkul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatkul(ScheduleParser.MatkulContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#preforw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreforw(ScheduleParser.PreforwContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#kapasitas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKapasitas(ScheduleParser.KapasitasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#fasilitas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFasilitas(ScheduleParser.FasilitasContext ctx);
}