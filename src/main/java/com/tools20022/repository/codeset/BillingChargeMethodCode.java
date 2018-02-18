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
import com.tools20022.repository.codeset.BillingChargeMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines how the billing charge is calculated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#UnitPriced
 * BillingChargeMethodCode.UnitPriced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#StampDuty
 * BillingChargeMethodCode.StampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#BaseCharge
 * BillingChargeMethodCode.BaseCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#DiscountPrice
 * BillingChargeMethodCode.DiscountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#FlatCharge
 * BillingChargeMethodCode.FlatCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#ListPrice
 * BillingChargeMethodCode.ListPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#MinimumCharge
 * BillingChargeMethodCode.MinimumCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#MaximumReduction
 * BillingChargeMethodCode.MaximumReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier1
 * BillingChargeMethodCode.Tier1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier2
 * BillingChargeMethodCode.Tier2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier3
 * BillingChargeMethodCode.Tier3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier4
 * BillingChargeMethodCode.Tier4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier5
 * BillingChargeMethodCode.Tier5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier6
 * BillingChargeMethodCode.Tier6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier7
 * BillingChargeMethodCode.Tier7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier8
 * BillingChargeMethodCode.Tier8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#Tier9
 * BillingChargeMethodCode.Tier9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#ThresholdPrice
 * BillingChargeMethodCode.ThresholdPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#ZonePrice
 * BillingChargeMethodCode.ZonePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#BalanceBased
 * BillingChargeMethodCode.BalanceBased}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
 * BillingChargeMethod1Code}</li>
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
 * <li>"UPRC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingChargeMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the billing charge is calculated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingChargeMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charge is calculated as the product of volume times unit price. This is
	 * the default value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is calculated as the product of volume times unit price. This is the default value."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode UnitPriced = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPriced";
			definition = "Charge is calculated as the product of volume times unit price. This is the default value.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "UPRC";
		}
	};
	/**
	 * Service is specifically identified as a stamp duty for accounting
	 * purposes. The charge is calculated as the product of volume times unit
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service is specifically identified as a stamp duty for accounting purposes. The charge is calculated as the product of volume times unit price."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode StampDuty = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Service is specifically identified as a stamp duty for accounting purposes. The charge is calculated as the product of volume times unit price.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Fee charged in addition to the volume times unit price when one or more
	 * units of the service are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee charged in addition to the volume times unit price when one or more units of the service are provided."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode BaseCharge = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCharge";
			definition = "Fee charged in addition to the volume times unit price when one or more units of the service are provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "BCHG";
		}
	};
	/**
	 * Charge is calculated using a price which is lower than the quoted bank
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is calculated using a price which is lower than the quoted bank price."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode DiscountPrice = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPrice";
			definition = "Charge is calculated using a price which is lower than the quoted bank price.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "DPRC";
		}
	};
	/**
	 * Fixed charge not tied to volume or unit price. Flat Charge fees do not
	 * require a volume or Unit Price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed charge not tied to volume or unit price. Flat Charge fees do not require a volume or Unit Price."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode FlatCharge = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatCharge";
			definition = "Fixed charge not tied to volume or unit price. Flat Charge fees do not require a volume or Unit Price.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "FCHG";
		}
	};
	/**
	 * A single service where the volume, original charge and balance required
	 * are the totals of two or more pricing tiers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A single service where the volume, original charge and balance required are the totals of two or more pricing tiers."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode ListPrice = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListPrice";
			definition = "A single service where the volume, original charge and balance required are the totals of two or more pricing tiers.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "LPRC";
		}
	};
	/**
	 * Lowest charge possible for the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lowest charge possible for the service."</li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode MinimumCharge = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCharge";
			definition = "Lowest charge possible for the service.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "MCHG";
		}
	};
	/**
	 * Maximum charge possible for the service even though volume times unit
	 * price exceeds the maximum reduction value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MXRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum charge possible for the service even though volume times unit price exceeds the maximum reduction value."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode MaximumReduction = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumReduction";
			definition = "Maximum charge possible for the service even though volume times unit price exceeds the maximum reduction value.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "MXRD";
		}
	};
	/**
	 * Line item represents a charge for tier 1 in a multi tier, volume discount
	 * charging structure. Designates the tier 1 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 1 in a multi tier, volume discount charging structure. Designates the tier 1 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier1 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier1";
			definition = "Line item represents a charge for tier 1 in a multi tier, volume discount charging structure. Designates the tier 1 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR1";
		}
	};
	/**
	 * Line item represents a charge for tier 2 in a multi tier, volume discount
	 * charging structure. Designates the tier 2 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 2 in a multi tier, volume discount charging structure. Designates the tier 2 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier2 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier2";
			definition = "Line item represents a charge for tier 2 in a multi tier, volume discount charging structure. Designates the tier 2 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR2";
		}
	};
	/**
	 * Line item represents a charge for tier 3 in a multi tier, volume discount
	 * charging structure. Designates the tier 3 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 3 in a multi tier, volume discount charging structure. Designates the tier 3 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier3 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier3";
			definition = "Line item represents a charge for tier 3 in a multi tier, volume discount charging structure. Designates the tier 3 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR3";
		}
	};
	/**
	 * Line item represents a charge for tier 4 in a multi tier, volume discount
	 * charging structure. Designates the tier 4 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 4 in a multi tier, volume discount charging structure. Designates the tier 4 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier4 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier4";
			definition = "Line item represents a charge for tier 4 in a multi tier, volume discount charging structure. Designates the tier 4 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR4";
		}
	};
	/**
	 * Line item represents a charge for tier 5 in a multi tier, volume discount
	 * charging structure. Designates the tier 5 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 5 in a multi tier, volume discount charging structure. Designates the tier 5 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier5 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier5";
			definition = "Line item represents a charge for tier 5 in a multi tier, volume discount charging structure. Designates the tier 5 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR5";
		}
	};
	/**
	 * Line item represents a charge for tier 6 in a multi tier, volume discount
	 * charging structure. Designates the tier 6 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 6 in a multi tier, volume discount charging structure. Designates the tier 6 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier6 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier6";
			definition = "Line item represents a charge for tier 6 in a multi tier, volume discount charging structure. Designates the tier 6 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR6";
		}
	};
	/**
	 * Line item represents a charge for tier 7 in a multi tier, volume discount
	 * charging structure. Designates the tier 7 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 7 in a multi tier, volume discount charging structure. Designates the tier 7 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier7 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier7";
			definition = "Line item represents a charge for tier 7 in a multi tier, volume discount charging structure. Designates the tier 7 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR7";
		}
	};
	/**
	 * Line item represents a charge for tier 8 in a multi tier, volume discount
	 * charging structure. Designates the tier 8 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 8 in a multi tier, volume discount charging structure. Designates the tier 8 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier8 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier8";
			definition = "Line item represents a charge for tier 8 in a multi tier, volume discount charging structure. Designates the tier 8 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR8";
		}
	};
	/**
	 * Line item represents a charge for tier 9 in a multi tier, volume discount
	 * charging structure. Designates the tier 9 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 9 in a multi tier, volume discount charging structure. Designates the tier 9 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode Tier9 = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier9";
			definition = "Line item represents a charge for tier 9 in a multi tier, volume discount charging structure. Designates the tier 9 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TIR9";
		}
	};
	/**
	 * Unit price is determined by the total volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit price is determined by the total volume."</li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode ThresholdPrice = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdPrice";
			definition = "Unit price is determined by the total volume.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "TPRC";
		}
	};
	/**
	 * Indicates different prices for the same service. Typically used in a
	 * relationship summary statement where the same service has a different
	 * price for different accounts in the relationship.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZonePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates different prices for the same service. Typically used in a relationship summary statement where the same service has a different price for different accounts in the relationship."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode ZonePrice = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZonePrice";
			definition = "Indicates different prices for the same service. Typically used in a relationship summary statement where the same service has a different price for different accounts in the relationship.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "ZPRC";
		}
	};
	/**
	 * Charge is calculated as a balance times a per-annum rate multiplied by a
	 * time factor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BBSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBased"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is calculated as a balance times a per-annum rate multiplied by a time factor."
	 * </li>
	 * </ul>
	 */
	public static final BillingChargeMethodCode BalanceBased = new BillingChargeMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBased";
			definition = "Charge is calculated as a balance times a per-annum rate multiplied by a time factor.";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethodCode.mmObject();
			codeName = "BBSE";
		}
	};
	final static private LinkedHashMap<String, BillingChargeMethodCode> codesByName = new LinkedHashMap<>();

	protected BillingChargeMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UPRC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingChargeMethodCode";
				definition = "Defines how the billing charge is calculated.";
				derivation_lazy = () -> Arrays.asList(BillingChargeMethod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingChargeMethodCode.UnitPriced, com.tools20022.repository.codeset.BillingChargeMethodCode.StampDuty,
						com.tools20022.repository.codeset.BillingChargeMethodCode.BaseCharge, com.tools20022.repository.codeset.BillingChargeMethodCode.DiscountPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.FlatCharge,
						com.tools20022.repository.codeset.BillingChargeMethodCode.ListPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.MinimumCharge,
						com.tools20022.repository.codeset.BillingChargeMethodCode.MaximumReduction, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier1, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier2,
						com.tools20022.repository.codeset.BillingChargeMethodCode.Tier3, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier4, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier5,
						com.tools20022.repository.codeset.BillingChargeMethodCode.Tier6, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier7, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier8,
						com.tools20022.repository.codeset.BillingChargeMethodCode.Tier9, com.tools20022.repository.codeset.BillingChargeMethodCode.ThresholdPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.ZonePrice,
						com.tools20022.repository.codeset.BillingChargeMethodCode.BalanceBased);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnitPriced.getCodeName().get(), UnitPriced);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(BaseCharge.getCodeName().get(), BaseCharge);
		codesByName.put(DiscountPrice.getCodeName().get(), DiscountPrice);
		codesByName.put(FlatCharge.getCodeName().get(), FlatCharge);
		codesByName.put(ListPrice.getCodeName().get(), ListPrice);
		codesByName.put(MinimumCharge.getCodeName().get(), MinimumCharge);
		codesByName.put(MaximumReduction.getCodeName().get(), MaximumReduction);
		codesByName.put(Tier1.getCodeName().get(), Tier1);
		codesByName.put(Tier2.getCodeName().get(), Tier2);
		codesByName.put(Tier3.getCodeName().get(), Tier3);
		codesByName.put(Tier4.getCodeName().get(), Tier4);
		codesByName.put(Tier5.getCodeName().get(), Tier5);
		codesByName.put(Tier6.getCodeName().get(), Tier6);
		codesByName.put(Tier7.getCodeName().get(), Tier7);
		codesByName.put(Tier8.getCodeName().get(), Tier8);
		codesByName.put(Tier9.getCodeName().get(), Tier9);
		codesByName.put(ThresholdPrice.getCodeName().get(), ThresholdPrice);
		codesByName.put(ZonePrice.getCodeName().get(), ZonePrice);
		codesByName.put(BalanceBased.getCodeName().get(), BalanceBased);
	}

	public static BillingChargeMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingChargeMethodCode[] values() {
		BillingChargeMethodCode[] values = new BillingChargeMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingChargeMethodCode> {
		@Override
		public BillingChargeMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingChargeMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}