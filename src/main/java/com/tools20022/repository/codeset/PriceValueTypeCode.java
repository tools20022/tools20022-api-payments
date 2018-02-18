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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PriceValueTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Price will not be paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Discount
 * PriceValueTypeCode.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Premium
 * PriceValueTypeCode.Premium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Par
 * PriceValueTypeCode.Par}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Yield
 * PriceValueTypeCode.Yield}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Spread
 * PriceValueTypeCode.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#PerUnit
 * PriceValueTypeCode.PerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Absolute
 * PriceValueTypeCode.Absolute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#TEDPrice
 * PriceValueTypeCode.TEDPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#TEDYield
 * PriceValueTypeCode.TEDYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#FixedCabinetTrade
 * PriceValueTypeCode.FixedCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#VariableCabinetTrade
 * PriceValueTypeCode.VariableCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Percentage
 * PriceValueTypeCode.Percentage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Unknown
 * PriceValueTypeCode.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#OpenDated
 * PriceValueTypeCode.OpenDated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#Unspecified
 * PriceValueTypeCode.Unspecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#ToBeSpecified
 * PriceValueTypeCode.ToBeSpecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#ActualAmount
 * PriceValueTypeCode.ActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#NilPayment
 * PriceValueTypeCode.NilPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType1Code
 * PriceValueType1Code}</li>
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
 * <li>"DISC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceValueTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Price will not be paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceValueTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a number of percentage points below par, for example,
	 * a discount price of 2.0% equals a price of 98 when par is 100.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100."
	 * </li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Discount = new PriceValueTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "DISC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Price expressed as a number of percentage points above par, for example,
	 * a premium price of 2.0% equals a price of 102 when par is 100.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: PREM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100."
	 * </li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Premium = new PriceValueTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "PREM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Price is the face amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Par"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is the face amount."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Par = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Par";
			definition = "Price is the face amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "PARV";
		}
	};
	/**
	 * Price expressed as a yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YIEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a yield."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Yield = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Price expressed as a yield.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "YIEL";
		}
	};
	/**
	 * Difference between a market maker's bid and asked price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference between a market maker's bid and asked price."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Spread = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Difference between a market maker's bid and asked price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "SPRE";
		}
	};
	/**
	 * Price expressed per unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed per unit."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode PerUnit = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerUnit";
			definition = "Price expressed per unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "PEUN";
		}
	};
	/**
	 * Price is expressed as absolute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABSO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Absolute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is expressed as absolute."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Absolute = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Absolute";
			definition = "Price is expressed as absolute.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "ABSO";
		}
	};
	/**
	 * Price is expressed as Treasury Euro Dollar price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is expressed as Treasury Euro Dollar price."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode TEDPrice = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEDPrice";
			definition = "Price is expressed as Treasury Euro Dollar price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "TEDP";
		}
	};
	/**
	 * Price is expressed as Treasury Euro Dollar yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is expressed as Treasury Euro Dollar yield."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode TEDYield = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEDYield";
			definition = "Price is expressed as Treasury Euro Dollar yield.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "TEDY";
		}
	};
	/**
	 * Cabinet trades are used to indicate prices that trade at a price lower
	 * than that available on an exchange and they can be fixed or variable
	 * (primarily used for listed futures and options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FICT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedCabinetTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options)."
	 * </li>
	 * </ul>
	 */
	public static final PriceValueTypeCode FixedCabinetTrade = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixedCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "FICT";
		}
	};
	/**
	 * Cabinet trades are used to indicate prices that trade at a price lower
	 * than that available on an exchange and they can be fixed or variable
	 * (primarily used for listed futures and options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableCabinetTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options)."
	 * </li>
	 * </ul>
	 */
	public static final PriceValueTypeCode VariableCabinetTrade = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "VACT";
		}
	};
	/**
	 * Price expressed as a percentage of par.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a percentage of par."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Percentage = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Price expressed as a percentage of par.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Price is unknown by the sender or has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is unknown by the sender or has not been established."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Unknown = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Price is unknown by the sender or has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Price has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenDated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price has not been established."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode OpenDated = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenDated";
			definition = "Price has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Price is not required to be specified by account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unspecified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is not required to be specified by account owner."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode Unspecified = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unspecified";
			definition = "Price is not required to be specified by account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "UNSP";
		}
	};
	/**
	 * Price to be specified by account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeSpecified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price to be specified by account owner."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode ToBeSpecified = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeSpecified";
			definition = "Price to be specified by account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "TBSP";
		}
	};
	/**
	 * Price expressed as a currency and amount per unit or per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a currency and amount per unit or per share."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode ActualAmount = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualAmount";
			definition = "Price expressed as a currency and amount per unit or per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * Price will not be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NILP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NilPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price will not be paid."</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode NilPayment = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NilPayment";
			definition = "Price will not be paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject();
			codeName = "NILP";
		}
	};
	final static private LinkedHashMap<String, PriceValueTypeCode> codesByName = new LinkedHashMap<>();

	protected PriceValueTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValueTypeCode";
				definition = "Price will not be paid.";
				derivation_lazy = () -> Arrays.asList(PriceValueType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceValueTypeCode.Discount, com.tools20022.repository.codeset.PriceValueTypeCode.Premium, com.tools20022.repository.codeset.PriceValueTypeCode.Par,
						com.tools20022.repository.codeset.PriceValueTypeCode.Yield, com.tools20022.repository.codeset.PriceValueTypeCode.Spread, com.tools20022.repository.codeset.PriceValueTypeCode.PerUnit,
						com.tools20022.repository.codeset.PriceValueTypeCode.Absolute, com.tools20022.repository.codeset.PriceValueTypeCode.TEDPrice, com.tools20022.repository.codeset.PriceValueTypeCode.TEDYield,
						com.tools20022.repository.codeset.PriceValueTypeCode.FixedCabinetTrade, com.tools20022.repository.codeset.PriceValueTypeCode.VariableCabinetTrade, com.tools20022.repository.codeset.PriceValueTypeCode.Percentage,
						com.tools20022.repository.codeset.PriceValueTypeCode.Unknown, com.tools20022.repository.codeset.PriceValueTypeCode.OpenDated, com.tools20022.repository.codeset.PriceValueTypeCode.Unspecified,
						com.tools20022.repository.codeset.PriceValueTypeCode.ToBeSpecified, com.tools20022.repository.codeset.PriceValueTypeCode.ActualAmount, com.tools20022.repository.codeset.PriceValueTypeCode.NilPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Par.getCodeName().get(), Par);
		codesByName.put(Yield.getCodeName().get(), Yield);
		codesByName.put(Spread.getCodeName().get(), Spread);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
		codesByName.put(Absolute.getCodeName().get(), Absolute);
		codesByName.put(TEDPrice.getCodeName().get(), TEDPrice);
		codesByName.put(TEDYield.getCodeName().get(), TEDYield);
		codesByName.put(FixedCabinetTrade.getCodeName().get(), FixedCabinetTrade);
		codesByName.put(VariableCabinetTrade.getCodeName().get(), VariableCabinetTrade);
		codesByName.put(Percentage.getCodeName().get(), Percentage);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(OpenDated.getCodeName().get(), OpenDated);
		codesByName.put(Unspecified.getCodeName().get(), Unspecified);
		codesByName.put(ToBeSpecified.getCodeName().get(), ToBeSpecified);
		codesByName.put(ActualAmount.getCodeName().get(), ActualAmount);
		codesByName.put(NilPayment.getCodeName().get(), NilPayment);
	}

	public static PriceValueTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceValueTypeCode[] values() {
		PriceValueTypeCode[] values = new PriceValueTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceValueTypeCode> {
		@Override
		public PriceValueTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceValueTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}