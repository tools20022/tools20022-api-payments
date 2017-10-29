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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode#Lot
 * UnitOfMeasureCode.Lot}</li>
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
public class UnitOfMeasureCode {

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
	public static final MMCode Kilogram = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Kilogram";
			definition = "Basic unit of mass in the SI system, 1000 grams.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Piece = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Piece";
			definition = "Standard length of cloth, wallpaper, as an item for sale or amount of a substance.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Ton = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ton";
			definition = "Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton).";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Metre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Metre";
			definition = "Unit of length in the metric system, equal to 39.37 inches.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Inch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Inch";
			definition = "Measure of length equal to 2.54 cm.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Yard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yard";
			definition = "Unit of length equal to 3 feet or 0.9144 metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode GBGallon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GBGA";
		}
	};
	/**
	 * Unit of measure that is equal to a 1,000th of a kilo.
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
	 * definition} = "Unit of measure that is equal to a 1,000th of a kilo."</li>
	 * </ul>
	 */
	public static final MMCode Gram = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gram";
			definition = "Unit of measure that is equal to a 1,000th of a kilo.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "GRAM";
		}
	};
	/**
	 * One 100th part of a metre.
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
	 * definition} = "One 100th part of a metre."</li>
	 * </ul>
	 */
	public static final MMCode Centimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Centimetre";
			definition = "One 100th part of a metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareMetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareMetre";
			definition = "Measure of a surface, one metre by one metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Foot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Foot";
			definition = "Unit of length equal to 1/3 yard.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "FOOT";
		}
	};
	/**
	 * Unit of length equal to 1,760 yards
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
	 * definition} = "Unit of length equal to 1,760 yards"</li>
	 * </ul>
	 */
	public static final MMCode Mile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mile";
			definition = "Unit of length equal to 1,760 yards";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareInch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareInch";
			definition = "Measure of a surface, one inch by one inch.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareFoot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareFoot";
			definition = "Measure of a surface, one foot by one foot.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareMile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareMile";
			definition = "Measure of a surface, one mile by one mile.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode GBOunce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode USOunce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USOunce";
			definition = "Unit of weight equal to a sixteenth of a pound.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode GBPint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBPint";
			definition = "Unit of volume that is equal to 568 cubic centimetres.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode USPint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USPint";
			definition = "Unit of volume that is equal to 473 cubic centimetres.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode GBQuart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GBQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode USQuart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USQuart";
			definition = "Unit of volume that is equal to 2 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode USGallon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USGallon";
			definition = "Unit of volume that is equal to 8 pints.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Millimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Millimetre";
			definition = "Unit of measure that is a thousandth of one metre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MMET";
		}
	};
	/**
	 * Unit of measure that is equal to 1,000 meters.
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
	 * definition} = "Unit of measure that is equal to 1,000 meters."</li>
	 * </ul>
	 */
	public static final MMCode Kilometre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Kilometre";
			definition = "Unit of measure that is equal to 1,000 meters.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareYard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareYard";
			definition = "Measure of a surface, one yard by one yard.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SQYA";
		}
	};
	/**
	 * Unit of measure equal to 4,840 square yards.
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
	 * definition} = "Unit of measure equal to 4,840 square yards."</li>
	 * </ul>
	 */
	public static final MMCode Acre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Acre";
			definition = "Unit of measure equal to 4,840 square yards.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Are = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Are";
			definition = "Unit of measure equal to a 100 square meters.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareMillimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareMillimetre";
			definition = "Measure of a surface, one millimetre by one millimetre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareCentimetre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareCentimetre";
			definition = "Measure of a surface, one centimetre by one centimetre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "SCMT";
		}
	};
	/**
	 * Unit of measure that is equal to 10,000 square meters.
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
	 * definition} = "Unit of measure that is equal to 10,000 square meters."</li>
	 * </ul>
	 */
	public static final MMCode Hectare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hectare";
			definition = "Unit of measure that is equal to 10,000 square meters.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode SquareKilometre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SquareKilometre";
			definition = "Measure of a surface, one kilometre by one kilometre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode MilliLitre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MilliLitre";
			definition = "Unit of volume that is equal to one thousandth of a litre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Centilitre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Centilitre";
			definition = "Unit of volume that is equal to one hundredth of a litre.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Litre = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Litre";
			definition = "Unit of volume that is equal to a thousand cubic centimetres.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	public static final MMCode Pound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pound";
			definition = "Unit of weight equal to 0.454 kilograms.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "PUND";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowances"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode Allowances = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowances";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ALOW";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOfCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode AmountOfCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOfCurrency";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ACCY";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Barrels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode Barrels = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Barrels";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BARL";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillionCubicFeet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode BillionCubicFeet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillionCubicFeet";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BCUF";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardFeet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode BoardFeet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardFeet";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BDFT";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bushels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode Bushels = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bushels";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "BUSL";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertifiedEmissionsReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode CertifiedEmissionsReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertifiedEmissionsReduction";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CEER";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClimateReserveTonnes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode ClimateReserveTonnes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClimateReserveTonnes";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CLRT";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode CubicMeters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMeters";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "CBME";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode Days = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Days";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "DAYS";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DryMetricTons"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode DryMetricTons = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DryMetricTons";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "DMET";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvironmentalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode EnvironmentalCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvironmentalCredit";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ENVC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvironmentalOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode EnvironmentalOffset = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvironmentalOffset";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "ENVO";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hundredweight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode Hundredweight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hundredweight";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "HUWG";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattDayCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode KilowattDayCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattDayCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of measure that is equal to the power consumption of one kilowatt during one hour."
	 * </li>
	 * </ul>
	 */
	public static final MMCode KilowattHours = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattHours";
			definition = "Unit of measure that is equal to the power consumption of one kilowatt during one hour.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWHO";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHoursCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode KilowattHoursCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattHoursCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWHC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattMinuteCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode KilowattMinuteCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattMinuteCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KMOC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattMonthCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode KilowattMonthCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattMonthCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWMC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattYearCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode KilowattYearCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattYearCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "KWYC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattDayCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MegawattDayCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattDayCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWDC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MegawattHours = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattHours";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWHO";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattHoursCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MegawattHoursCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattHoursCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWHC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattMinuteCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MegawattMinuteCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattMinuteCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWMC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattMonthCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MegawattMonthCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattMonthCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MMOC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegawattYearCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MegawattYearCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegawattYearCapacity";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MWYC";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MetricTons"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MetricTons = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MetricTons";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "TONE";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MillionBarrels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode MillionBarrels = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MillionBarrels";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MIBA";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneMillionBTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode OneMillionBTU = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneMillionBTU";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "MBTU";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TroyOunces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode TroyOunces = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TroyOunces";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "OZTR";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USHundredweight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode USHundredweight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USHundredweight";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "UCWT";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode IndexPoint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPoint";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "IPNT";
		}
	};
	/**
	 * TO BE REVIEWED
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalWithRelationToDebtInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TO BE REVIEWED"</li>
	 * </ul>
	 */
	public static final MMCode PrincipalWithRelationToDebtInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalWithRelationToDebtInstrument";
			definition = "TO BE REVIEWED";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieselGallonEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of fuel alternative equal to one gallon of diesel."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DieselGallonEquivalent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieselGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of diesel.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasolineGallonEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of fuel alternative equal to one gallon of gasoline."</li>
	 * </ul>
	 */
	public static final MMCode GasolineGallonEquivalent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GasolineGallonEquivalent";
			definition = "Amount of fuel alternative equal to one gallon of gasoline.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TonsOfCarbonDioxide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tons of carbon dioxide."</li>
	 * </ul>
	 */
	public static final MMCode TonsOfCarbonDioxide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TonsOfCarbonDioxide";
			definition = "Tons of carbon dioxide.";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "TOCD";
		}
	};
	/**
	 * Indication of the unit of measurement
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication of the unit of measurement"</li>
	 * </ul>
	 */
	public static final MMCode Lot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lot";
			definition = "Indication of the unit of measurement";
			owner_lazy = () -> UnitOfMeasureCode.mmObject();
			codeName = "LOTS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("KILO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasureCode";
				definition = "Identifies the unit of measure by means of a code.";
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
						com.tools20022.repository.codeset.UnitOfMeasureCode.TonsOfCarbonDioxide, com.tools20022.repository.codeset.UnitOfMeasureCode.Lot);
				derivation_lazy = () -> Arrays.asList(UnitOfMeasure1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}