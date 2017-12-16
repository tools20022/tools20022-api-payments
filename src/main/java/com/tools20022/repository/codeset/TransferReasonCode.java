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
import com.tools20022.repository.codeset.TransferReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the assets transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#OrdinaryTransfer
 * TransferReasonCode.mmOrdinaryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#TransferBetweenSpouses
 * TransferReasonCode.mmTransferBetweenSpouses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#Demerger
 * TransferReasonCode.mmDemerger}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferReasonCode#Gift
 * TransferReasonCode.mmGift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#Heritage
 * TransferReasonCode.mmHeritage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#BetweenOwnAccounts
 * TransferReasonCode.mmBetweenOwnAccounts}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TransferReasonCode#Trade
 * TransferReasonCode.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#UndividedPossession
 * TransferReasonCode.mmUndividedPossession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#PledgedAccountTransfer
 * TransferReasonCode.mmPledgedAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#TransferBetweenDifferentBeneficiaries
 * TransferReasonCode.mmTransferBetweenDifferentBeneficiaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode#TDTFrameworkTransfer
 * TransferReasonCode.mmTDTFrameworkTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TRAO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for the assets transfer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer is ordinary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is ordinary."</li>
	 * </ul>
	 */
	public static final TransferReasonCode OrdinaryTransfer = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryTransfer";
			definition = "Transfer is ordinary.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAO";
		}
	};
	/**
	 * Transfer is between spouses.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferBetweenSpouses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is between spouses."</li>
	 * </ul>
	 */
	public static final TransferReasonCode TransferBetweenSpouses = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferBetweenSpouses";
			definition = "Transfer is between spouses.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAC";
		}
	};
	/**
	 * Transfer is the result of a demrger or division.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is the result of a demrger or division."</li>
	 * </ul>
	 */
	public static final TransferReasonCode Demerger = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Demerger";
			definition = "Transfer is the result of a demrger or division.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAF";
		}
	};
	/**
	 * Transfer is a gift.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gift"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is a gift."</li>
	 * </ul>
	 */
	public static final TransferReasonCode Gift = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			definition = "Transfer is a gift.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAG";
		}
	};
	/**
	 * Transfer is a heritage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Heritage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is a heritage."</li>
	 * </ul>
	 */
	public static final TransferReasonCode Heritage = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Heritage";
			definition = "Transfer is a heritage.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Transfer is between own accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BetweenOwnAccounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is between own accounts."</li>
	 * </ul>
	 */
	public static final TransferReasonCode BetweenOwnAccounts = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BetweenOwnAccounts";
			definition = "Transfer is between own accounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Transfer is a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is a trade."</li>
	 * </ul>
	 */
	public static final TransferReasonCode Trade = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Transfer is a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAT";
		}
	};
	/**
	 * Transfer is an undivided possession.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndividedPossession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is an undivided possession."</li>
	 * </ul>
	 */
	public static final TransferReasonCode UndividedPossession = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndividedPossession";
			definition = "Transfer is an undivided possession.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRAU";
		}
	};
	/**
	 * Transfer to pledged account (in certain circumstances distributors have
	 * to freeze and transfer total or partial holding to separate omnibus
	 * account e.g. investigation required by fiscal authority or police).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer to pledged account (in certain circumstances distributors have to freeze and transfer total or partial holding to separate omnibus account e.g. investigation required by fiscal authority or police)."
	 * </li>
	 * </ul>
	 */
	public static final TransferReasonCode PledgedAccountTransfer = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedAccountTransfer";
			definition = "Transfer to pledged account (in certain circumstances distributors have to freeze and transfer total or partial holding to separate omnibus account e.g. investigation required by fiscal authority or police).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TPLD";
		}
	};
	/**
	 * Transfer between different beneficiaries with taxation to be applied
	 * (accounts with different owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferBetweenDifferentBeneficiaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer between different beneficiaries with taxation to be applied (accounts with different owner)."
	 * </li>
	 * </ul>
	 */
	public static final TransferReasonCode TransferBetweenDifferentBeneficiaries = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferBetweenDifferentBeneficiaries";
			definition = "Transfer between different beneficiaries with taxation to be applied (accounts with different owner).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TRPE";
		}
	};
	/**
	 * Transfer instruction executed within TDT framework (TDT framework is the
	 * operation model promoted by the Italian Banking Association for transfer
	 * and most of transfers, but not all, will be executed in accordance with
	 * that process).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TDTFrameworkTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer instruction executed within TDT framework (TDT framework is the operation model promoted by the Italian Banking Association for transfer and most of transfers, but not all, will be executed in accordance with that process)."
	 * </li>
	 * </ul>
	 */
	public static final TransferReasonCode TDTFrameworkTransfer = new TransferReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TDTFrameworkTransfer";
			definition = "Transfer instruction executed within TDT framework (TDT framework is the operation model promoted by the Italian Banking Association for transfer and most of transfers, but not all, will be executed in accordance with that process).";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferReasonCode.mmObject();
			codeName = "TTDT";
		}
	};
	final static private LinkedHashMap<String, TransferReasonCode> codesByName = new LinkedHashMap<>();

	protected TransferReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TRAO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferReasonCode";
				definition = "Specifies the reason for the assets transfer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferReasonCode.OrdinaryTransfer, com.tools20022.repository.codeset.TransferReasonCode.TransferBetweenSpouses,
						com.tools20022.repository.codeset.TransferReasonCode.Demerger, com.tools20022.repository.codeset.TransferReasonCode.Gift, com.tools20022.repository.codeset.TransferReasonCode.Heritage,
						com.tools20022.repository.codeset.TransferReasonCode.BetweenOwnAccounts, com.tools20022.repository.codeset.TransferReasonCode.Trade, com.tools20022.repository.codeset.TransferReasonCode.UndividedPossession,
						com.tools20022.repository.codeset.TransferReasonCode.PledgedAccountTransfer, com.tools20022.repository.codeset.TransferReasonCode.TransferBetweenDifferentBeneficiaries,
						com.tools20022.repository.codeset.TransferReasonCode.TDTFrameworkTransfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OrdinaryTransfer.getCodeName().get(), OrdinaryTransfer);
		codesByName.put(TransferBetweenSpouses.getCodeName().get(), TransferBetweenSpouses);
		codesByName.put(Demerger.getCodeName().get(), Demerger);
		codesByName.put(Gift.getCodeName().get(), Gift);
		codesByName.put(Heritage.getCodeName().get(), Heritage);
		codesByName.put(BetweenOwnAccounts.getCodeName().get(), BetweenOwnAccounts);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(UndividedPossession.getCodeName().get(), UndividedPossession);
		codesByName.put(PledgedAccountTransfer.getCodeName().get(), PledgedAccountTransfer);
		codesByName.put(TransferBetweenDifferentBeneficiaries.getCodeName().get(), TransferBetweenDifferentBeneficiaries);
		codesByName.put(TDTFrameworkTransfer.getCodeName().get(), TDTFrameworkTransfer);
	}

	public static TransferReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferReasonCode[] values() {
		TransferReasonCode[] values = new TransferReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferReasonCode> {
		@Override
		public TransferReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}