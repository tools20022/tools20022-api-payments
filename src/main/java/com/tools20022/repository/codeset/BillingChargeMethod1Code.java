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
import com.tools20022.repository.codeset.BillingChargeMethod1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#UnitPriced
 * BillingChargeMethod1Code.mmUnitPriced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#StampDuty
 * BillingChargeMethod1Code.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#BaseCharge
 * BillingChargeMethod1Code.mmBaseCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#DiscountPrice
 * BillingChargeMethod1Code.mmDiscountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#FlatCharge
 * BillingChargeMethod1Code.mmFlatCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#ListPrice
 * BillingChargeMethod1Code.mmListPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#MinimumCharge
 * BillingChargeMethod1Code.mmMinimumCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#MaximumReduction
 * BillingChargeMethod1Code.mmMaximumReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier1
 * BillingChargeMethod1Code.mmTier1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier2
 * BillingChargeMethod1Code.mmTier2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier3
 * BillingChargeMethod1Code.mmTier3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier4
 * BillingChargeMethod1Code.mmTier4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier5
 * BillingChargeMethod1Code.mmTier5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier6
 * BillingChargeMethod1Code.mmTier6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier7
 * BillingChargeMethod1Code.mmTier7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier8
 * BillingChargeMethod1Code.mmTier8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier9
 * BillingChargeMethod1Code.mmTier9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#ThresholdPrice
 * BillingChargeMethod1Code.mmThresholdPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#ZonePrice
 * BillingChargeMethod1Code.mmZonePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#BalanceBased
 * BillingChargeMethod1Code.mmBalanceBased}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
 * BillingChargeMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "BillingChargeMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the billing charge is calculated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BillingChargeMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriced"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code UnitPriced = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPriced";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.UnitPriced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code StampDuty = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.StampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCharge"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code BaseCharge = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.BaseCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountPrice"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code DiscountPrice = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.DiscountPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatCharge"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code FlatCharge = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.FlatCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListPrice"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code ListPrice = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.ListPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCharge"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code MinimumCharge = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.MinimumCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumReduction"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code MaximumReduction = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.MaximumReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier1"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier1 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier1";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier2"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier2 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier2";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier3"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier3 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier3";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier4"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier4 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier4";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier4.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier5"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier5 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier5";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier5.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier6"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier6 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier6";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier6.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier7"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier7 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier7";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier7.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier8"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier8 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier8";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier8.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier9"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code Tier9 = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier9";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.Tier9.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdPrice"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code ThresholdPrice = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.ThresholdPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZonePrice"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code ZonePrice = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZonePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.ZonePrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBased"</li>
	 * </ul>
	 */
	public static final BillingChargeMethod1Code BalanceBased = new BillingChargeMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBased";
			owner_lazy = () -> com.tools20022.repository.codeset.BillingChargeMethod1Code.mmObject();
			codeName = BillingChargeMethodCode.BalanceBased.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BillingChargeMethod1Code> codesByName = new LinkedHashMap<>();

	protected BillingChargeMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UPRC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingChargeMethod1Code";
				definition = "Defines how the billing charge is calculated.";
				trace_lazy = () -> BillingChargeMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingChargeMethod1Code.UnitPriced, com.tools20022.repository.codeset.BillingChargeMethod1Code.StampDuty,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.BaseCharge, com.tools20022.repository.codeset.BillingChargeMethod1Code.DiscountPrice, com.tools20022.repository.codeset.BillingChargeMethod1Code.FlatCharge,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.ListPrice, com.tools20022.repository.codeset.BillingChargeMethod1Code.MinimumCharge,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.MaximumReduction, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier1, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier2,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier3, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier4, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier5,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier6, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier7, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier8,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier9, com.tools20022.repository.codeset.BillingChargeMethod1Code.ThresholdPrice, com.tools20022.repository.codeset.BillingChargeMethod1Code.ZonePrice,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.BalanceBased);
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

	public static BillingChargeMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BillingChargeMethod1Code[] values() {
		BillingChargeMethod1Code[] values = new BillingChargeMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BillingChargeMethod1Code> {
		@Override
		public BillingChargeMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BillingChargeMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}