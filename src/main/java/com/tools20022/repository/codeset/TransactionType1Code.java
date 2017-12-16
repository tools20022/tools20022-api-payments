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
import com.tools20022.repository.codeset.TransactionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#Redemption
 * TransactionType1Code.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#Subscription
 * TransactionType1Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#SubscriptionSavingsPlan
 * TransactionType1Code.mmSubscriptionSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#RedemptionWithdrawingPlan
 * TransactionType1Code.mmRedemptionWithdrawingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#Switch
 * TransactionType1Code.mmSwitch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#CorporationActionEvent
 * TransactionType1Code.mmCorporationActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#TransferIn
 * TransactionType1Code.mmTransferIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#TransferOut
 * TransactionType1Code.mmTransferOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#SwitchIn
 * TransactionType1Code.mmSwitchIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#SwitchOut
 * TransactionType1Code.mmSwitchOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#SubscriptionAssetAllocation
 * TransactionType1Code.mmSubscriptionAssetAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code#RedemptionAssetAllocation
 * TransactionType1Code.mmRedemptionAssetAllocation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
 * InvestmentFundTransactionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final TransactionType1Code Redemption = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final TransactionType1Code Subscription = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionSavingsPlan"</li>
	 * </ul>
	 */
	public static final TransactionType1Code SubscriptionSavingsPlan = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SubscriptionSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionWithdrawingPlan"</li>
	 * </ul>
	 */
	public static final TransactionType1Code RedemptionWithdrawingPlan = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionWithdrawingPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.RedemptionWithdrawingPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final TransactionType1Code Switch = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporationActionEvent"</li>
	 * </ul>
	 */
	public static final TransactionType1Code CorporationActionEvent = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporationActionEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CorporationActionEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIn"</li>
	 * </ul>
	 */
	public static final TransactionType1Code TransferIn = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.TransferIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOut"</li>
	 * </ul>
	 */
	public static final TransactionType1Code TransferOut = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.TransferOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchIn"</li>
	 * </ul>
	 */
	public static final TransactionType1Code SwitchIn = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchIn";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SwitchIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOut"</li>
	 * </ul>
	 */
	public static final TransactionType1Code SwitchOut = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOut";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SwitchOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionAssetAllocation"</li>
	 * </ul>
	 */
	public static final TransactionType1Code SubscriptionAssetAllocation = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionAssetAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SubscriptionAssetAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAssetAllocation"</li>
	 * </ul>
	 */
	public static final TransactionType1Code RedemptionAssetAllocation = new TransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAssetAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.RedemptionAssetAllocation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionType1Code> codesByName = new LinkedHashMap<>();

	protected TransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionType1Code";
				definition = "Specifies the type of transaction.";
				trace_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionType1Code.Redemption, com.tools20022.repository.codeset.TransactionType1Code.Subscription,
						com.tools20022.repository.codeset.TransactionType1Code.SubscriptionSavingsPlan, com.tools20022.repository.codeset.TransactionType1Code.RedemptionWithdrawingPlan,
						com.tools20022.repository.codeset.TransactionType1Code.Switch, com.tools20022.repository.codeset.TransactionType1Code.CorporationActionEvent, com.tools20022.repository.codeset.TransactionType1Code.TransferIn,
						com.tools20022.repository.codeset.TransactionType1Code.TransferOut, com.tools20022.repository.codeset.TransactionType1Code.SwitchIn, com.tools20022.repository.codeset.TransactionType1Code.SwitchOut,
						com.tools20022.repository.codeset.TransactionType1Code.SubscriptionAssetAllocation, com.tools20022.repository.codeset.TransactionType1Code.RedemptionAssetAllocation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SubscriptionSavingsPlan.getCodeName().get(), SubscriptionSavingsPlan);
		codesByName.put(RedemptionWithdrawingPlan.getCodeName().get(), RedemptionWithdrawingPlan);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(CorporationActionEvent.getCodeName().get(), CorporationActionEvent);
		codesByName.put(TransferIn.getCodeName().get(), TransferIn);
		codesByName.put(TransferOut.getCodeName().get(), TransferOut);
		codesByName.put(SwitchIn.getCodeName().get(), SwitchIn);
		codesByName.put(SwitchOut.getCodeName().get(), SwitchOut);
		codesByName.put(SubscriptionAssetAllocation.getCodeName().get(), SubscriptionAssetAllocation);
		codesByName.put(RedemptionAssetAllocation.getCodeName().get(), RedemptionAssetAllocation);
	}

	public static TransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionType1Code[] values() {
		TransactionType1Code[] values = new TransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionType1Code> {
		@Override
		public TransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}