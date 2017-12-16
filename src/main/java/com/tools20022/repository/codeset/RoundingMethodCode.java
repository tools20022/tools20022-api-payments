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
import com.tools20022.repository.codeset.RoundingMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines how the rounding amount was applied in the calculation. For example,
 * should the amount of collateral required be rounded up, down, to the closer
 * integral multiple specified or not rounded.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethodCode#Down
 * RoundingMethodCode.mmDown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethodCode#Up
 * RoundingMethodCode.mmUp}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethodCode#None
 * RoundingMethodCode.mmNone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethodCode#Closer
 * RoundingMethodCode.mmCloser}</li>
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
 * <li>"DRDW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RoundingMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RoundingMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rounds the amount down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
	 * RoundingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Down"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rounds the amount down."</li>
	 * </ul>
	 */
	public static final RoundingMethodCode Down = new RoundingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Down";
			definition = "Rounds the amount down.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethodCode.mmObject();
			codeName = "DRDW";
		}
	};
	/**
	 * Rounds the amount up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
	 * RoundingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Up"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rounds the amount up."</li>
	 * </ul>
	 */
	public static final RoundingMethodCode Up = new RoundingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Up";
			definition = "Rounds the amount up.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethodCode.mmObject();
			codeName = "DRUP";
		}
	};
	/**
	 * Do not round.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
	 * RoundingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not round."</li>
	 * </ul>
	 */
	public static final RoundingMethodCode None = new RoundingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "Do not round.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethodCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Rounds the amount to the closer integral multiple specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
	 * RoundingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounds the amount to the closer integral multiple specified."</li>
	 * </ul>
	 */
	public static final RoundingMethodCode Closer = new RoundingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closer";
			definition = "Rounds the amount to the closer integral multiple specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethodCode.mmObject();
			codeName = "CLSR";
		}
	};
	final static private LinkedHashMap<String, RoundingMethodCode> codesByName = new LinkedHashMap<>();

	protected RoundingMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DRDW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingMethodCode";
				definition = "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingMethodCode.Down, com.tools20022.repository.codeset.RoundingMethodCode.Up, com.tools20022.repository.codeset.RoundingMethodCode.None,
						com.tools20022.repository.codeset.RoundingMethodCode.Closer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Down.getCodeName().get(), Down);
		codesByName.put(Up.getCodeName().get(), Up);
		codesByName.put(None.getCodeName().get(), None);
		codesByName.put(Closer.getCodeName().get(), Closer);
	}

	public static RoundingMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RoundingMethodCode[] values() {
		RoundingMethodCode[] values = new RoundingMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RoundingMethodCode> {
		@Override
		public RoundingMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RoundingMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}