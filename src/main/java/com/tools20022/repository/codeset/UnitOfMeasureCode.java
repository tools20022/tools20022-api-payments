/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UnitOfMeasureCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the unit of measure by means of a code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Kilogram
 * UnitOfMeasureCode.Kilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Piece
 * UnitOfMeasureCode.Piece}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Ton
 * UnitOfMeasureCode.Ton}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Metre
 * UnitOfMeasureCode.Metre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Inch
 * UnitOfMeasureCode.Inch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Yard
 * UnitOfMeasureCode.Yard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBGallon
 * UnitOfMeasureCode.GBGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Gram
 * UnitOfMeasureCode.Gram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Centimetre
 * UnitOfMeasureCode.Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareMetre
 * UnitOfMeasureCode.SquareMetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Foot
 * UnitOfMeasureCode.Foot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Mile
 * UnitOfMeasureCode.Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareInch
 * UnitOfMeasureCode.SquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareFoot
 * UnitOfMeasureCode.SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareMile
 * UnitOfMeasureCode.SquareMile}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBOunce
 * UnitOfMeasureCode.GBOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USOunce
 * UnitOfMeasureCode.USOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBPint
 * UnitOfMeasureCode.GBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USPint
 * UnitOfMeasureCode.USPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBQuart
 * UnitOfMeasureCode.GBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USQuart
 * UnitOfMeasureCode.USQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USGallon
 * UnitOfMeasureCode.USGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Millimetre
 * UnitOfMeasureCode.Millimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Kilometre
 * UnitOfMeasureCode.Kilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareYard
 * UnitOfMeasureCode.SquareYard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Acre
 * UnitOfMeasureCode.Acre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Are
 * UnitOfMeasureCode.Are}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareMillimetre
 * UnitOfMeasureCode.SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareCentimetre
 * UnitOfMeasureCode.SquareCentimetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Hectare
 * UnitOfMeasureCode.Hectare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#SquareKilometre
 * UnitOfMeasureCode.SquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MilliLitre
 * UnitOfMeasureCode.MilliLitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Centilitre
 * UnitOfMeasureCode.Centilitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Litre
 * UnitOfMeasureCode.Litre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Pound
 * UnitOfMeasureCode.Pound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Allowances
 * UnitOfMeasureCode.Allowances}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#AmountOfCurrency
 * UnitOfMeasureCode.AmountOfCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Barrels
 * UnitOfMeasureCode.Barrels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BillionCubicFeet
 * UnitOfMeasureCode.BillionCubicFeet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BoardFeet
 * UnitOfMeasureCode.BoardFeet}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Bushels
 * UnitOfMeasureCode.Bushels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CertifiedEmissionsReduction
 * UnitOfMeasureCode.CertifiedEmissionsReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#ClimateReserveTonnes
 * UnitOfMeasureCode.ClimateReserveTonnes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CubicMeters
 * UnitOfMeasureCode.CubicMeters}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Days
 * UnitOfMeasureCode.Days}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#DryMetricTons
 * UnitOfMeasureCode.DryMetricTons}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#EnvironmentalCredit
 * UnitOfMeasureCode.EnvironmentalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#EnvironmentalOffset
 * UnitOfMeasureCode.EnvironmentalOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Hundredweight
 * UnitOfMeasureCode.Hundredweight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KilowattDayCapacity
 * UnitOfMeasureCode.KilowattDayCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KilowattHours
 * UnitOfMeasureCode.KilowattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KilowattHoursCapacity
 * UnitOfMeasureCode.KilowattHoursCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KilowattMinuteCapacity
 * UnitOfMeasureCode.KilowattMinuteCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KilowattMonthCapacity
 * UnitOfMeasureCode.KilowattMonthCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#KilowattYearCapacity
 * UnitOfMeasureCode.KilowattYearCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MegawattDayCapacity
 * UnitOfMeasureCode.MegawattDayCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MegawattHours
 * UnitOfMeasureCode.MegawattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MegawattHoursCapacity
 * UnitOfMeasureCode.MegawattHoursCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MegawattMinuteCapacity
 * UnitOfMeasureCode.MegawattMinuteCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MegawattMonthCapacity
 * UnitOfMeasureCode.MegawattMonthCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MegawattYearCapacity
 * UnitOfMeasureCode.MegawattYearCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MetricTons
 * UnitOfMeasureCode.MetricTons}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#MillionBarrels
 * UnitOfMeasureCode.MillionBarrels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#OneMillionBTU
 * UnitOfMeasureCode.OneMillionBTU}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#TroyOunces
 * UnitOfMeasureCode.TroyOunces}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USHundredweight
 * UnitOfMeasureCode.USHundredweight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#IndexPoint
 * UnitOfMeasureCode.IndexPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#PrincipalWithRelationToDebtInstrument
 * UnitOfMeasureCode.PrincipalWithRelationToDebtInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#DieselGallonEquivalent
 * UnitOfMeasureCode.DieselGallonEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GasolineGallonEquivalent
 * UnitOfMeasureCode.GasolineGallonEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#TonsOfCarbonDioxide
 * UnitOfMeasureCode.TonsOfCarbonDioxide}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Shares
 * UnitOfMeasureCode.Shares}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Therms
 * UnitOfMeasureCode.Therms}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Future
 * UnitOfMeasureCode.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GigawattHours
 * UnitOfMeasureCode.GigawattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#BritishThermalUnit
 * UnitOfMeasureCode.BritishThermalUnit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Lot
 * UnitOfMeasureCode.Lot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Bag
 * UnitOfMeasureCode.Bag}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Bale
 * UnitOfMeasureCode.Bale}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Bottle
 * UnitOfMeasureCode.Bottle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Box
 * UnitOfMeasureCode.Box}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Carton
 * UnitOfMeasureCode.Carton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Container
 * UnitOfMeasureCode.Container}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Crate
 * UnitOfMeasureCode.Crate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CubicInch
 * UnitOfMeasureCode.CubicInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#CubicMillimetre
 * UnitOfMeasureCode.CubicMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBFuildOunce
 * UnitOfMeasureCode.GBFuildOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#GBTon
 * UnitOfMeasureCode.GBTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USBarrel
 * UnitOfMeasureCode.USBarrel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USFluidOunce
 * UnitOfMeasureCode.USFluidOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#USTon
 * UnitOfMeasureCode.USTon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
 * UnitOfMeasure1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"KILO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasureCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the unit of measure by means of a code."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasureCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Basic unit of mass in the SI system, 1000 grams.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KILO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Basic unit of mass in the SI system, 1000 grams."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Kilogram = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kilogram";
			definition = "Basic unit of mass in the SI system, 1000 grams.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KILO";
		}
	};
	/**
	 * Standard length of cloth, wallpaper, as an item for sale or amount of a
	 * substance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PIEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard length of cloth, wallpaper, as an item for sale or amount of a substance."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Piece = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Piece";
			definition = "Standard length of cloth, wallpaper, as an item for sale or amount of a substance.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "PIEC";
		}
	};
	/**
	 * Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb
	 * (short ton).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ton"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton)."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Ton = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ton";
			definition = "Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "TONS";
		}
	};
	/**
	 * Unit of length in the metric system, equal to 39.37 inches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "METR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of length in the metric system, equal to 39.37 inches."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Metre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Metre";
			definition = "Unit of length in the metric system, equal to 39.37 inches.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "METR";
		}
	};
	/**
	 * Measure of length equal to 2.54 cm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of length equal to 2.54 cm."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Inch = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Inch";
			definition = "Measure of length equal to 2.54 cm.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "INCH";
		}
	};
	/**
	 * Unit of length equal to 3 feet or 0.9144 metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YARD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of length equal to 3 feet or 0.9144 metre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Yard = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yard";
			definition = "Unit of length equal to 3 feet or 0.9144 metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "YARD";
		}
	};
	/**
	 * Unit of volume that is equal to 8 pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 8 pints."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBGallon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GBGA";
		}
	};
	/**
	 * Unit of measure that is equal to a 1, 000th of a kilo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is equal to a 1, 000th of a kilo."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Gram = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gram";
			definition = "Unit of measure that is equal to a 1, 000th of a kilo.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GRAM";
		}
	};
	/**
	 * Unit of measure that is equal to one hundredth of a metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure that is equal to one hundredth of a metre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Centimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centimetre";
			definition = "Unit of measure that is equal to one hundredth of a metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CMET";
		}
	};
	/**
	 * Measure of a surface, one metre by one metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one metre by one metre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareMetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMetre";
			definition = "Measure of a surface, one metre by one metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SMET";
		}
	};
	/**
	 * Unit of length equal to 1/3 yard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of length equal to 1/3 yard."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Foot = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Foot";
			definition = "Unit of length equal to 1/3 yard.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "FOOT";
		}
	};
	/**
	 * Unit of length equal to 1, 760 yards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MILE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of length equal to 1, 760 yards."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Mile = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mile";
			definition = "Unit of length equal to 1, 760 yards.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MILE";
		}
	};
	/**
	 * Measure of a surface, one inch by one inch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one inch by one inch."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareInch = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareInch";
			definition = "Measure of a surface, one inch by one inch.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SQIN";
		}
	};
	/**
	 * Measure of a surface, one foot by one foot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one foot by one foot."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareFoot = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareFoot";
			definition = "Measure of a surface, one foot by one foot.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SQFO";
		}
	};
	/**
	 * Measure of a surface, one mile by one mile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one mile by one mile."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareMile = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMile";
			definition = "Measure of a surface, one mile by one mile.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SQMI";
		}
	};
	/**
	 * Unit of weight equal to a sixteenth of a pound.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of weight equal to a sixteenth of a pound."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GBOU";
		}
	};
	/**
	 * Unit of weight equal to a sixteenth of a pound.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of weight equal to a sixteenth of a pound."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USOU";
		}
	};
	/**
	 * Unit of volume that is equal to 568 cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 568 cubic centimetres."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBPint = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBPint";
			definition = "Unit of volume that is equal to 568 cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GBPI";
		}
	};
	/**
	 * Unit of volume that is equal to 473 cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 473 cubic centimetres."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USPint = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USPint";
			definition = "Unit of volume that is equal to 473 cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USPI";
		}
	};
	/**
	 * Unit of volume that is equal to 2 pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBQA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 2 pints."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBQuart = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GBQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GBQA";
		}
	};
	/**
	 * Unit of volume that is equal to 2 pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USQA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 2 pints."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USQuart = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USQA";
		}
	};
	/**
	 * Unit of volume that is equal to 8 pints.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 8 pints."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USGallon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USGA";
		}
	};
	/**
	 * Unit of measure that is a thousandth of one metre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is a thousandth of one metre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Millimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Millimetre";
			definition = "Unit of measure that is a thousandth of one metre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MMET";
		}
	};
	/**
	 * Unit of measure that is equal to 1, 000 meters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is equal to 1, 000 meters."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Kilometre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kilometre";
			definition = "Unit of measure that is equal to 1, 000 meters.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KMET";
		}
	};
	/**
	 * Measure of a surface, one yard by one yard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one yard by one yard."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareYard = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareYard";
			definition = "Measure of a surface, one yard by one yard.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SQYA";
		}
	};
	/**
	 * Unit of measure equal to 4, 840 square yards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure equal to 4, 840 square yards."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Acre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acre";
			definition = "Unit of measure equal to 4, 840 square yards.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "ACRE";
		}
	};
	/**
	 * Unit of measure equal to a 100 square meters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure equal to a 100 square meters."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Are = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Are";
			definition = "Unit of measure equal to a 100 square meters.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "ARES";
		}
	};
	/**
	 * Measure of a surface, one millimetre by one millimetre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one millimetre by one millimetre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareMillimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareMillimetre";
			definition = "Measure of a surface, one millimetre by one millimetre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SMIL";
		}
	};
	/**
	 * Measure of a surface, one centimetre by one centimetre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one centimetre by one centimetre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareCentimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareCentimetre";
			definition = "Measure of a surface, one centimetre by one centimetre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SCMT";
		}
	};
	/**
	 * Unit of measure that is equal to 10, 000 square meters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HECT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure that is equal to 10, 000 square meters."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Hectare = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hectare";
			definition = "Unit of measure that is equal to 10, 000 square meters.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "HECT";
		}
	};
	/**
	 * Measure of a surface, one kilometre by one kilometre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQKI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a surface, one kilometre by one kilometre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode SquareKilometre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SquareKilometre";
			definition = "Measure of a surface, one kilometre by one kilometre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SQKI";
		}
	};
	/**
	 * Unit of volume that is equal to one thousandth of a litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MILI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to one thousandth of a litre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MilliLitre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MilliLitre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MILI";
		}
	};
	/**
	 * Unit of volume that is equal to one hundredth of a litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CELI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to one hundredth of a litre."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Centilitre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Centilitre";
			definition = "Unit of volume that is equal to one hundredth of a litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CELI";
		}
	};
	/**
	 * Unit of volume that is equal to a thousand cubic centimetres.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LITR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to a thousand cubic centimetres."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Litre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Litre";
			definition = "Unit of volume that is equal to a thousand cubic centimetres.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "LITR";
		}
	};
	/**
	 * Unit of weight equal to 0.454 kilograms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of weight equal to 0.454 kilograms."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Pound = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pound";
			definition = "Unit of weight equal to 0.454 kilograms.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "PUND";
		}
	};
	/**
	 * Amount of money deducted from a price or an amount due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALOW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowances"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money deducted from a price or an amount due."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Allowances = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allowances";
			definition = "Amount of money deducted from a price or an amount due.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "ALOW";
		}
	};
	/**
	 * Number of monetary units specified in a currency, where the unit of
	 * currency is explicit and compliant with ISO 4217.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOfCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode AmountOfCurrency = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountOfCurrency";
			definition = "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "ACCY";
		}
	};
	/**
	 * Unit of volume that is equal to 42 US gallons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BARL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Barrels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume that is equal to 42 US gallons."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Barrels = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Barrels";
			definition = "Unit of volume that is equal to 42 US gallons.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BARL";
		}
	};
	/**
	 * Unit of measure for large volumes of natural gas equivalent to 28316846
	 * cubic meters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCUF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillionCubicFeet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure for large volumes of natural gas equivalent to 28316846 cubic meters."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BillionCubicFeet = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillionCubicFeet";
			definition = "Unit of measure for large volumes of natural gas equivalent to 28316846 cubic meters.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BCUF";
		}
	};
	/**
	 * Measure of length equal to to 144 cubic inches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardFeet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of length equal to to 144 cubic inches."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BoardFeet = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardFeet";
			definition = "Measure of length equal to to 144 cubic inches.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BDFT";
		}
	};
	/**
	 * Unit of weight that is equal to 8 gallons. Mostly used for agricultural
	 * products with a specification of weight defined for each commodity
	 * differently.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bushels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of weight that is equal to 8 gallons. Mostly used for agricultural products with a specification of weight defined for each commodity differently."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Bushels = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bushels";
			definition = "Unit of weight that is equal to 8 gallons. Mostly used for agricultural products with a specification of weight defined for each commodity differently.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BUSL";
		}
	};
	/**
	 * Unit of emissions type (or carbon credits) issued by the Clean
	 * Development Mechanism (CDM) Executive Board for emission reductions
	 * achieved by CDM projects and verified by a DOE (Designated Operational
	 * Entity) under the rules of the Kyoto Protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertifiedEmissionsReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of emissions type (or carbon credits) issued by the Clean Development Mechanism (CDM) Executive Board for emission reductions achieved by CDM projects and verified by a DOE (Designated Operational Entity) under the rules of the Kyoto Protocol."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CertifiedEmissionsReduction = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertifiedEmissionsReduction";
			definition = "Unit of emissions type (or carbon credits) issued by the Clean Development Mechanism (CDM) Executive Board for emission reductions achieved by CDM projects and verified by a DOE (Designated Operational Entity) under the rules of the Kyoto Protocol.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CEER";
		}
	};
	/**
	 * Unit of offset credits used by the Climate Action Reserve. One Climate
	 * Reserve Tonne is equal to one metric ton of Greenhouse Gas (GHG)
	 * reduced/sequestered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClimateReserveTonnes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of offset credits used by the Climate Action Reserve. One Climate Reserve Tonne is equal to one metric ton of Greenhouse Gas (GHG) reduced/sequestered."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode ClimateReserveTonnes = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClimateReserveTonnes";
			definition = "Unit of offset credits used by the Climate Action Reserve. One Climate Reserve Tonne is equal to one metric ton of Greenhouse Gas (GHG) reduced/sequestered.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CLRT";
		}
	};
	/**
	 * Unit of volume that is equal to one metre in length, breadth and height
	 * or also equal to 1000 liter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to one metre in length, breadth and height or also equal to 1000 liter."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CubicMeters = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CubicMeters";
			definition = "Unit of volume that is equal to one metre in length, breadth and height or also equal to 1000 liter.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CBME";
		}
	};
	/**
	 * Unit of time that is equal to 24 hours.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of time that is equal to 24 hours."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Days = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Days";
			definition = "Unit of time that is equal to 24 hours.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "DAYS";
		}
	};
	/**
	 * Unit of weight that is equal to the same mass value as a metric ton
	 * excluding moisture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DryMetricTons"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of weight that is equal to the same mass value as a metric ton excluding moisture."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode DryMetricTons = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DryMetricTons";
			definition = "Unit of weight that is equal to the same mass value as a metric ton excluding moisture.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "DMET";
		}
	};
	/**
	 * Unit of measure for ownership of credit (or allowance) of carbon dioxyde
	 * emission (in metric ton).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENVC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvironmentalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure for ownership of credit (or allowance) of carbon dioxyde emission (in metric ton)."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode EnvironmentalCredit = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EnvironmentalCredit";
			definition = "Unit of measure for ownership of credit (or allowance) of carbon dioxyde emission (in metric ton).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "ENVC";
		}
	};
	/**
	 * Unit of measure for reduction of carbon dioxyde emission (in metric ton)
	 * that may result in Environmental Credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvironmentalOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure for reduction of carbon dioxyde emission (in metric ton) that may result in Environmental Credit."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode EnvironmentalOffset = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EnvironmentalOffset";
			definition = "Unit of measure for reduction of carbon dioxyde emission (in metric ton) that may result in Environmental Credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "ENVO";
		}
	};
	/**
	 * Unit of weight or mass of various values in the Imperial Unit System also
	 * known as quintal, cental or centum.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HUWG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hundredweight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of weight or mass of various values in the Imperial Unit System also known as quintal, cental or centum."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Hundredweight = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hundredweight";
			definition = "Unit of weight or mass of various values in the Imperial Unit System also known as quintal, cental or centum.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "HUWG";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000 watt in one day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattDayCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000 watt in one day."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KilowattDayCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattDayCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one day.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KWDC";
		}
	};
	/**
	 * Unit of measure that is equal to the power consumption of one kilowatt
	 * during one hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure that is equal to the power consumption of one kilowatt during one hour."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KilowattHours = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattHours";
			definition = "Unit of measure that is equal to the power consumption of one kilowatt during one hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KWHO";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000 watt in one hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWHC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHoursCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000 watt in one hour."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KilowattHoursCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattHoursCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KWHC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000 watt in one minute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KMOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattMinuteCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000 watt in one minute."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KilowattMinuteCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattMinuteCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one minute.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KMOC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000 watt in one month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattMonthCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000 watt in one month."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KilowattMonthCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattMonthCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one month.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KWMC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000 watt in one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWYC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattYearCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000 watt in one year."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode KilowattYearCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KilowattYearCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000 watt in one year.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "KWYC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000000 watt in one day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattDayCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one day."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MegawattDayCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattDayCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one day.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MWDC";
		}
	};
	/**
	 * Unit of measure that is equal to the power consumption of one megawatt
	 * during one hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure that is equal to the power consumption of one megawatt during one hour."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MegawattHours = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattHours";
			definition = "Unit of measure that is equal to the power consumption of one megawatt during one hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MWHO";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000000 watt in one hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWHC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattHoursCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one hour."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MegawattHoursCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattHoursCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MWHC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000000 watt in one minute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattMinuteCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one minute."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MegawattMinuteCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattMinuteCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one minute.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MWMC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000000 watt in one month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattMonthCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one month."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MegawattMonthCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattMonthCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one month.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MMOC";
		}
	};
	/**
	 * Unit of measure of the capacity of production of electric power equal to
	 * 1000000 watt in one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWYC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattYearCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one year."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MegawattYearCapacity = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegawattYearCapacity";
			definition = "Unit of measure of the capacity of production of electric power equal to 1000000 watt in one year.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MWYC";
		}
	};
	/**
	 * Unit of mass equal to 1000 kilograms; equivalent to approximately 2,204.6
	 * pounds, 1.102 short tons (US) or 0.984 long tons (imperial).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MetricTons"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of mass equal to 1000 kilograms; equivalent to approximately 2,204.6 pounds, 1.102 short tons (US) or 0.984 long tons (imperial)."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MetricTons = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MetricTons";
			definition = "Unit of mass equal to 1000 kilograms; equivalent to approximately 2,204.6 pounds, 1.102 short tons (US) or 0.984 long tons (imperial).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "TONE";
		}
	};
	/**
	 * Unit of volume that is equal to 1 million barrels equivalent to
	 * 42.000.000 US gallons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MillionBarrels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to 1 million barrels equivalent to 42.000.000 US gallons."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode MillionBarrels = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MillionBarrels";
			definition = "Unit of volume that is equal to 1 million barrels equivalent to 42.000.000 US gallons.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MIBA";
		}
	};
	/**
	 * Unit of measure of heat equal to one million British thermal unit (BTU).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MBTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneMillionBTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of heat equal to one million British thermal unit (BTU)."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode OneMillionBTU = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OneMillionBTU";
			definition = "Unit of measure of heat equal to one million British thermal unit (BTU).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "MBTU";
		}
	};
	/**
	 * Unit of weight equal to 31.1034768 grams. Used in precious metals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OZTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TroyOunces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of weight equal to 31.1034768 grams. Used in precious metals."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode TroyOunces = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TroyOunces";
			definition = "Unit of weight equal to 31.1034768 grams. Used in precious metals.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "OZTR";
		}
	};
	/**
	 * Unit of weight or mass of various values in the US Customary System also
	 * known as quintal, cental or centum. Equal to 100 lbs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCWT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USHundredweight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of weight or mass of various values in the US Customary System also known as quintal, cental or centum. Equal to 100 lbs."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USHundredweight = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USHundredweight";
			definition = "Unit of weight or mass of various values in the US Customary System also known as quintal, cental or centum. Equal to 100 lbs.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "UCWT";
		}
	};
	/**
	 * Decimal number used to calculate an amount or a price price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decimal number used to calculate an amount or a price price."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode IndexPoint = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexPoint";
			definition = "Decimal number used to calculate an amount or a price price.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "IPNT";
		}
	};
	/**
	 * Amount of money borrowed, or part of that amount which remains unpaid
	 * (excluding interest).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalWithRelationToDebtInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money borrowed, or part of that amount which remains unpaid (excluding interest)."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode PrincipalWithRelationToDebtInstrument = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalWithRelationToDebtInstrument";
			definition = "Amount of money borrowed, or part of that amount which remains unpaid (excluding interest).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "PWRD";
		}
	};
	/**
	 * Amount of fuel alternative equal to one gallon of diesel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGEU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieselGallonEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of fuel alternative equal to one gallon of diesel."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode DieselGallonEquivalent = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DieselGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of diesel.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "DGEU";
		}
	};
	/**
	 * Amount of fuel alternative equal to one gallon of gasoline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GGEU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasolineGallonEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of fuel alternative equal to one gallon of gasoline."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GasolineGallonEquivalent = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GasolineGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of gasoline.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GGEU";
		}
	};
	/**
	 * Tons of carbon dioxide.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TonsOfCarbonDioxide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tons of carbon dioxide."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode TonsOfCarbonDioxide = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TonsOfCarbonDioxide";
			definition = "Tons of carbon dioxide.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "TOCD";
		}
	};
	/**
	 * Financial instrument that gives the owner right to dividends paid by a
	 * company and the most junior claim on the companies assets in the event of
	 * a bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument that gives the owner right to dividends paid by a company and the most junior claim on the companies assets in the event of a bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Shares = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Shares";
			definition = "Financial instrument that gives the owner right to dividends paid by a company and the most junior claim on the companies assets in the event of a bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "SHAS";
		}
	};
	/**
	 * Unit of heat, often used a unit of measure for natural gas in the UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THMS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Therms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of heat, often used a unit of measure for natural gas in the UK."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Therms = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Therms";
			definition = "Unit of heat, often used a unit of measure for natural gas in the UK.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "THMS";
		}
	};
	/**
	 * Exchange traded contract that defines an agreement to buy specific
	 * quantities of a commodity or financial instrument at an agreed time in
	 * the future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange traded contract that defines an agreement to buy specific quantities of a commodity or financial instrument at an agreed time in the future."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Future = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Exchange traded contract that defines an agreement to buy specific quantities of a commodity or financial instrument at an agreed time in the future.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Unit of measure that is equal to the power consumption of one Gigawatt
	 * during one hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GWHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GigawattHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure that is equal to the power consumption of one Gigawatt during one hour."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GigawattHours = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GigawattHours";
			definition = "Unit of measure that is equal to the power consumption of one Gigawatt during one hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GWHO";
		}
	};
	/**
	 * Unit of measure of heat required to raise the temperature of one pound of
	 * water by one degree Fahrenheit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BritishThermalUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure of heat required to raise the temperature of one pound of water by one degree Fahrenheit."
	 * </li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode BritishThermalUnit = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BritishThermalUnit";
			definition = "Unit of measure of heat required to raise the temperature of one pound of water by one degree Fahrenheit.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BRTU";
		}
	};
	/**
	 * Indication of the unit of measurement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication of the unit of measurement."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Lot = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Indication of the unit of measurement.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "LOTS";
		}
	};
	/**
	 * Code for a bag.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAGG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a bag."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Bag = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bag";
			definition = "Code for a bag.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BAGG";
		}
	};
	/**
	 * Code for a bale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BALE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a bale."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Bale = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bale";
			definition = "Code for a bale.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BALE";
		}
	};
	/**
	 * Code for a bottle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bottle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a bottle."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Bottle = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bottle";
			definition = "Code for a bottle.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BOTL";
		}
	};
	/**
	 * Code for a box.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOXX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Box"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a box."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Box = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Box";
			definition = "Code for a box.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "BOXX";
		}
	};
	/**
	 * Code for a carton.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carton"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a carton."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Carton = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carton";
			definition = "Code for a carton.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CRTN";
		}
	};
	/**
	 * Code for a container.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Container"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a container."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Container = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Container";
			definition = "Code for a container.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CNTR";
		}
	};
	/**
	 * Code for a crate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for a crate."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode Crate = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crate";
			definition = "Code for a crate.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CRAT";
		}
	};
	/**
	 * Measure of a volume, one inch by one inch by one inch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicInch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of a volume, one inch by one inch by one inch."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CubicInch = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicInch";
			definition = "Measure of a volume, one inch by one inch by one inch.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CBIN";
		}
	};
	/**
	 * Unit of volume that is equal to one thousandth of a litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBML"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMillimetre"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of volume that is equal to one thousandth of a litre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode CubicMillimetre = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMillimetre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "CBML";
		}
	};
	/**
	 * Unit of volume equal to 2, 841 306 centilitre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBFuildOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume equal to 2, 841 306 centilitre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBFuildOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBFuildOunce";
			definition = "Unit of volume equal to 2, 841 306 centilitre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GBFO";
		}
	};
	/**
	 * Measure of weight, in Britain 2240 lb (long ton).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of weight, in Britain 2240 lb (long ton)."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode GBTon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBTon";
			definition = "Measure of weight, in Britain 2240 lb (long ton).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "GBTN";
		}
	};
	/**
	 * Unit of volume equal to 158, 9873 litre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBarrel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume equal to 158, 9873 litre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USBarrel = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBarrel";
			definition = "Unit of volume equal to 158, 9873 litre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USBA";
		}
	};
	/**
	 * Unit of volume equal to 2, 957353 centilitre.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFluidOunce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of volume equal to 2, 957353 centilitre."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USFluidOunce = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USFluidOunce";
			definition = "Unit of volume equal to 2, 957353 centilitre.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USFO";
		}
	};
	/**
	 * Measure of weight, in the US 2000 lb (short ton).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measure of weight, in the US 2000 lb (short ton)."</li>
	 * </ul>
	 */
	public static final UnitOfMeasureCode USTon = new UnitOfMeasureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTon";
			definition = "Measure of weight, in the US 2000 lb (short ton).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasureCode.mmObject();
			codeName = "USTN";
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasureCode> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasureCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("KILO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasureCode";
				definition = "Identifies the unit of measure by means of a code.";
				derivation_lazy = () -> Arrays.asList(UnitOfMeasure1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasureCode.Kilogram, com.tools20022.repository.codeset.UnitOfMeasureCode.Piece, com.tools20022.repository.codeset.UnitOfMeasureCode.Ton,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Metre, com.tools20022.repository.codeset.UnitOfMeasureCode.Inch, com.tools20022.repository.codeset.UnitOfMeasureCode.Yard,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GBGallon, com.tools20022.repository.codeset.UnitOfMeasureCode.Gram, com.tools20022.repository.codeset.UnitOfMeasureCode.Centimetre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasureCode.Foot, com.tools20022.repository.codeset.UnitOfMeasureCode.Mile,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareInch, com.tools20022.repository.codeset.UnitOfMeasureCode.SquareFoot, com.tools20022.repository.codeset.UnitOfMeasureCode.SquareMile,
						com.tools20022.repository.codeset.UnitOfMeasureCode.GBOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.USOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.GBPint,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USPint, com.tools20022.repository.codeset.UnitOfMeasureCode.GBQuart, com.tools20022.repository.codeset.UnitOfMeasureCode.USQuart,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USGallon, com.tools20022.repository.codeset.UnitOfMeasureCode.Millimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.Kilometre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareYard, com.tools20022.repository.codeset.UnitOfMeasureCode.Acre, com.tools20022.repository.codeset.UnitOfMeasureCode.Are,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.Hectare,
						com.tools20022.repository.codeset.UnitOfMeasureCode.SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasureCode.MilliLitre, com.tools20022.repository.codeset.UnitOfMeasureCode.Centilitre,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Litre, com.tools20022.repository.codeset.UnitOfMeasureCode.Pound, com.tools20022.repository.codeset.UnitOfMeasureCode.Allowances,
						com.tools20022.repository.codeset.UnitOfMeasureCode.AmountOfCurrency, com.tools20022.repository.codeset.UnitOfMeasureCode.Barrels, com.tools20022.repository.codeset.UnitOfMeasureCode.BillionCubicFeet,
						com.tools20022.repository.codeset.UnitOfMeasureCode.BoardFeet, com.tools20022.repository.codeset.UnitOfMeasureCode.Bushels, com.tools20022.repository.codeset.UnitOfMeasureCode.CertifiedEmissionsReduction,
						com.tools20022.repository.codeset.UnitOfMeasureCode.ClimateReserveTonnes, com.tools20022.repository.codeset.UnitOfMeasureCode.CubicMeters, com.tools20022.repository.codeset.UnitOfMeasureCode.Days,
						com.tools20022.repository.codeset.UnitOfMeasureCode.DryMetricTons, com.tools20022.repository.codeset.UnitOfMeasureCode.EnvironmentalCredit, com.tools20022.repository.codeset.UnitOfMeasureCode.EnvironmentalOffset,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Hundredweight, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattDayCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattHours,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattHoursCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattMinuteCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattMonthCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.KilowattYearCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattDayCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattHours, com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattHoursCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattMinuteCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattMonthCapacity,
						com.tools20022.repository.codeset.UnitOfMeasureCode.MegawattYearCapacity, com.tools20022.repository.codeset.UnitOfMeasureCode.MetricTons, com.tools20022.repository.codeset.UnitOfMeasureCode.MillionBarrels,
						com.tools20022.repository.codeset.UnitOfMeasureCode.OneMillionBTU, com.tools20022.repository.codeset.UnitOfMeasureCode.TroyOunces, com.tools20022.repository.codeset.UnitOfMeasureCode.USHundredweight,
						com.tools20022.repository.codeset.UnitOfMeasureCode.IndexPoint, com.tools20022.repository.codeset.UnitOfMeasureCode.PrincipalWithRelationToDebtInstrument,
						com.tools20022.repository.codeset.UnitOfMeasureCode.DieselGallonEquivalent, com.tools20022.repository.codeset.UnitOfMeasureCode.GasolineGallonEquivalent,
						com.tools20022.repository.codeset.UnitOfMeasureCode.TonsOfCarbonDioxide, com.tools20022.repository.codeset.UnitOfMeasureCode.Shares, com.tools20022.repository.codeset.UnitOfMeasureCode.Therms,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Future, com.tools20022.repository.codeset.UnitOfMeasureCode.GigawattHours, com.tools20022.repository.codeset.UnitOfMeasureCode.BritishThermalUnit,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Lot, com.tools20022.repository.codeset.UnitOfMeasureCode.Bag, com.tools20022.repository.codeset.UnitOfMeasureCode.Bale,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Bottle, com.tools20022.repository.codeset.UnitOfMeasureCode.Box, com.tools20022.repository.codeset.UnitOfMeasureCode.Carton,
						com.tools20022.repository.codeset.UnitOfMeasureCode.Container, com.tools20022.repository.codeset.UnitOfMeasureCode.Crate, com.tools20022.repository.codeset.UnitOfMeasureCode.CubicInch,
						com.tools20022.repository.codeset.UnitOfMeasureCode.CubicMillimetre, com.tools20022.repository.codeset.UnitOfMeasureCode.GBFuildOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.GBTon,
						com.tools20022.repository.codeset.UnitOfMeasureCode.USBarrel, com.tools20022.repository.codeset.UnitOfMeasureCode.USFluidOunce, com.tools20022.repository.codeset.UnitOfMeasureCode.USTon);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Piece.getCodeName().get(), Piece);
		codesByName.put(Ton.getCodeName().get(), Ton);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(GBOunce.getCodeName().get(), GBOunce);
		codesByName.put(USOunce.getCodeName().get(), USOunce);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(Acre.getCodeName().get(), Acre);
		codesByName.put(Are.getCodeName().get(), Are);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(Hectare.getCodeName().get(), Hectare);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(MilliLitre.getCodeName().get(), MilliLitre);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(Allowances.getCodeName().get(), Allowances);
		codesByName.put(AmountOfCurrency.getCodeName().get(), AmountOfCurrency);
		codesByName.put(Barrels.getCodeName().get(), Barrels);
		codesByName.put(BillionCubicFeet.getCodeName().get(), BillionCubicFeet);
		codesByName.put(BoardFeet.getCodeName().get(), BoardFeet);
		codesByName.put(Bushels.getCodeName().get(), Bushels);
		codesByName.put(CertifiedEmissionsReduction.getCodeName().get(), CertifiedEmissionsReduction);
		codesByName.put(ClimateReserveTonnes.getCodeName().get(), ClimateReserveTonnes);
		codesByName.put(CubicMeters.getCodeName().get(), CubicMeters);
		codesByName.put(Days.getCodeName().get(), Days);
		codesByName.put(DryMetricTons.getCodeName().get(), DryMetricTons);
		codesByName.put(EnvironmentalCredit.getCodeName().get(), EnvironmentalCredit);
		codesByName.put(EnvironmentalOffset.getCodeName().get(), EnvironmentalOffset);
		codesByName.put(Hundredweight.getCodeName().get(), Hundredweight);
		codesByName.put(KilowattDayCapacity.getCodeName().get(), KilowattDayCapacity);
		codesByName.put(KilowattHours.getCodeName().get(), KilowattHours);
		codesByName.put(KilowattHoursCapacity.getCodeName().get(), KilowattHoursCapacity);
		codesByName.put(KilowattMinuteCapacity.getCodeName().get(), KilowattMinuteCapacity);
		codesByName.put(KilowattMonthCapacity.getCodeName().get(), KilowattMonthCapacity);
		codesByName.put(KilowattYearCapacity.getCodeName().get(), KilowattYearCapacity);
		codesByName.put(MegawattDayCapacity.getCodeName().get(), MegawattDayCapacity);
		codesByName.put(MegawattHours.getCodeName().get(), MegawattHours);
		codesByName.put(MegawattHoursCapacity.getCodeName().get(), MegawattHoursCapacity);
		codesByName.put(MegawattMinuteCapacity.getCodeName().get(), MegawattMinuteCapacity);
		codesByName.put(MegawattMonthCapacity.getCodeName().get(), MegawattMonthCapacity);
		codesByName.put(MegawattYearCapacity.getCodeName().get(), MegawattYearCapacity);
		codesByName.put(MetricTons.getCodeName().get(), MetricTons);
		codesByName.put(MillionBarrels.getCodeName().get(), MillionBarrels);
		codesByName.put(OneMillionBTU.getCodeName().get(), OneMillionBTU);
		codesByName.put(TroyOunces.getCodeName().get(), TroyOunces);
		codesByName.put(USHundredweight.getCodeName().get(), USHundredweight);
		codesByName.put(IndexPoint.getCodeName().get(), IndexPoint);
		codesByName.put(PrincipalWithRelationToDebtInstrument.getCodeName().get(), PrincipalWithRelationToDebtInstrument);
		codesByName.put(DieselGallonEquivalent.getCodeName().get(), DieselGallonEquivalent);
		codesByName.put(GasolineGallonEquivalent.getCodeName().get(), GasolineGallonEquivalent);
		codesByName.put(TonsOfCarbonDioxide.getCodeName().get(), TonsOfCarbonDioxide);
		codesByName.put(Shares.getCodeName().get(), Shares);
		codesByName.put(Therms.getCodeName().get(), Therms);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(GigawattHours.getCodeName().get(), GigawattHours);
		codesByName.put(BritishThermalUnit.getCodeName().get(), BritishThermalUnit);
		codesByName.put(Lot.getCodeName().get(), Lot);
		codesByName.put(Bag.getCodeName().get(), Bag);
		codesByName.put(Bale.getCodeName().get(), Bale);
		codesByName.put(Bottle.getCodeName().get(), Bottle);
		codesByName.put(Box.getCodeName().get(), Box);
		codesByName.put(Carton.getCodeName().get(), Carton);
		codesByName.put(Container.getCodeName().get(), Container);
		codesByName.put(Crate.getCodeName().get(), Crate);
		codesByName.put(CubicInch.getCodeName().get(), CubicInch);
		codesByName.put(CubicMillimetre.getCodeName().get(), CubicMillimetre);
		codesByName.put(GBFuildOunce.getCodeName().get(), GBFuildOunce);
		codesByName.put(GBTon.getCodeName().get(), GBTon);
		codesByName.put(USBarrel.getCodeName().get(), USBarrel);
		codesByName.put(USFluidOunce.getCodeName().get(), USFluidOunce);
		codesByName.put(USTon.getCodeName().get(), USTon);
	}

	public static UnitOfMeasureCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasureCode[] values() {
		UnitOfMeasureCode[] values = new UnitOfMeasureCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasureCode> {
		@Override
		public UnitOfMeasureCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasureCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}