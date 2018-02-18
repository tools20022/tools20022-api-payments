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
import com.tools20022.repository.codeset.UnitOfMeasure1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unit of measure of the item purchased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Piece
 * UnitOfMeasure1Code.Piece}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Ton
 * UnitOfMeasure1Code.Ton}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Foot
 * UnitOfMeasure1Code.Foot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBGallon
 * UnitOfMeasure1Code.GBGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USGallon
 * UnitOfMeasure1Code.USGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Gram
 * UnitOfMeasure1Code.Gram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Inch
 * UnitOfMeasure1Code.Inch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Kilogram
 * UnitOfMeasure1Code.Kilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Pound
 * UnitOfMeasure1Code.Pound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Metre
 * UnitOfMeasure1Code.Metre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Centimetre
 * UnitOfMeasure1Code.Centimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Millimetre
 * UnitOfMeasure1Code.Millimetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Litre
 * UnitOfMeasure1Code.Litre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Centilitre
 * UnitOfMeasure1Code.Centilitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#MilliLitre
 * UnitOfMeasure1Code.MilliLitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBOunce
 * UnitOfMeasure1Code.GBOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USOunce
 * UnitOfMeasure1Code.USOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBQuart
 * UnitOfMeasure1Code.GBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USQuart
 * UnitOfMeasure1Code.USQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#GBPint
 * UnitOfMeasure1Code.GBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#USPint
 * UnitOfMeasure1Code.USPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Mile
 * UnitOfMeasure1Code.Mile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Kilometre
 * UnitOfMeasure1Code.Kilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Yard
 * UnitOfMeasure1Code.Yard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareKilometre
 * UnitOfMeasure1Code.SquareKilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Hectare
 * UnitOfMeasure1Code.Hectare}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Are
 * UnitOfMeasure1Code.Are}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareMetre
 * UnitOfMeasure1Code.SquareMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareCentimetre
 * UnitOfMeasure1Code.SquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareMillimetre
 * UnitOfMeasure1Code.SquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareMile
 * UnitOfMeasure1Code.SquareMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareYard
 * UnitOfMeasure1Code.SquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareFoot
 * UnitOfMeasure1Code.SquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#SquareInch
 * UnitOfMeasure1Code.SquareInch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code#Acre
 * UnitOfMeasure1Code.Acre}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
 * UnitOfMeasureCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PIEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of measure of the item purchased."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Piece = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Piece";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Piece.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Ton = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ton";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Ton.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Foot = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBGallon = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USGallon = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Gram = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Inch = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Kilogram = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Pound = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Metre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Centimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Millimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Litre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Centilitre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code MilliLitre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MilliLitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.MilliLitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBOunce = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USOunce = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBQuart = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USQuart = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code GBPint = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code USPint = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Mile = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Kilometre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Yard = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareKilometre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Hectare = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hectare";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Hectare.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Are = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Are";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Are.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareMetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareCentimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareMillimetre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareMile = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareYard = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareFoot = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code SquareInch = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure1Code
	 * UnitOfMeasure1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure1Code Acre = new UnitOfMeasure1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure1Code.mmObject();
			codeName = UnitOfMeasureCode.Acre.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure1Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PIEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasure1Code";
				definition = "Unit of measure of the item purchased.";
				trace_lazy = () -> UnitOfMeasureCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure1Code.Piece, com.tools20022.repository.codeset.UnitOfMeasure1Code.Ton, com.tools20022.repository.codeset.UnitOfMeasure1Code.Foot,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure1Code.USGallon, com.tools20022.repository.codeset.UnitOfMeasure1Code.Gram,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Inch, com.tools20022.repository.codeset.UnitOfMeasure1Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure1Code.Pound,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Centimetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Millimetre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Litre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Centilitre, com.tools20022.repository.codeset.UnitOfMeasure1Code.MilliLitre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.GBOunce, com.tools20022.repository.codeset.UnitOfMeasure1Code.USOunce, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBQuart,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure1Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure1Code.USPint,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.Mile, com.tools20022.repository.codeset.UnitOfMeasure1Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Yard,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasure1Code.Hectare, com.tools20022.repository.codeset.UnitOfMeasure1Code.Are,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareMillimetre,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareMile, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareYard, com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareFoot,
						com.tools20022.repository.codeset.UnitOfMeasure1Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure1Code.Acre);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Piece.getCodeName().get(), Piece);
		codesByName.put(Ton.getCodeName().get(), Ton);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(MilliLitre.getCodeName().get(), MilliLitre);
		codesByName.put(GBOunce.getCodeName().get(), GBOunce);
		codesByName.put(USOunce.getCodeName().get(), USOunce);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(Hectare.getCodeName().get(), Hectare);
		codesByName.put(Are.getCodeName().get(), Are);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(Acre.getCodeName().get(), Acre);
	}

	public static UnitOfMeasure1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure1Code[] values() {
		UnitOfMeasure1Code[] values = new UnitOfMeasure1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure1Code> {
		@Override
		public UnitOfMeasure1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}